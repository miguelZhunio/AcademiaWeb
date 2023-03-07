package validaciones;

import clases.Estudiante;
import clases.Fecha;
import clases.*;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Zhunio Miguel
 * 
 */
public class Registro {
    public static ArrayList<String> messageError = new ArrayList<>();
    public static boolean error;
    public static SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
    
    
    public static boolean Estudiante(String cedula, String nombre, String apellido, String pais, String correo, String password, String fecha_inscripcion, String nivel) {
        
        ObjectSet consultaCedulaEst = AcademiaWeb.Base.get(new Estudiante(null, null, cedula, null, null, null, null ,null));
        ObjectSet consultaCedulaPro = AcademiaWeb.Base.get(new Profesor(null, null, null, null, null, 0,cedula, null, null, null, null, null));
        ObjectSet consultaCedulaGer = AcademiaWeb.Base.get(new Gerente(null, null, null, null, 0, cedula, null, null, null, null, null));
        
        if (!(consultaCedulaEst.isEmpty() && consultaCedulaPro.isEmpty() && consultaCedulaGer.isEmpty())) {
            messageError.add("YA EXISTE LA CEDULA");
            error = true;
        }
 
        
        ObjectSet consultaPais = AcademiaWeb.Base.get(new Pais(pais, null, 0, 0));
            
        if (!(consultaPais.isEmpty())) {
            messageError.add("NO EXISTE ESE PAIS");
            error = true;
        }
        
        if (!(correo.matches("[a-zA-Z0-9]{10,80}"))) {
            messageError.add("CORREO NO VALIDO");
            error = true;
        }
        
        Crear.Fecha(new Date());
        
                    
        switch(nivel) {
            case "basico":
                nivel = "1";
                break;
            case "Intermedio":
                nivel = "2";
                break;
            case "Avanzado":
                nivel = "3";
                break;
                
        }    
        
        if (error) {
            JOptionPane.showMessageDialog(null, messageError.get(0));
            
        } else {
            AcademiaWeb.Base.set(new Estudiante(fecha_inscripcion, nivel, cedula, nombre, apellido, pais, correo, password));
        }
        
        return error;
    }
    
    public static boolean Profesor(String especialidad, String id_gerente, String id_tra, String titulo_tra, String fecha_cobro, double sueldo, String cedula ,String nombre, String apellido, String pais, String correo, String password) throws ParseException {
        
        ObjectSet consultaCedulaEst = AcademiaWeb.Base.get(new Estudiante(null, null, cedula, null, null, null, null ,null));
        ObjectSet consultaCedulaPro = AcademiaWeb.Base.get(new Profesor(null, null, null, null, null, 0,cedula, null, null, null, null, null));
        ObjectSet consultaCedulaGer = AcademiaWeb.Base.get(new Gerente(null, null, null, null, 0, cedula, null, null, null, null, null));
        
        if (!(consultaCedulaEst.isEmpty() && consultaCedulaPro.isEmpty() && consultaCedulaGer.isEmpty())) {
            messageError.add("YA EXISTE LA CEDULA");
            error = true;
        }
        
        ObjectSet consultaPais = AcademiaWeb.Base.get(new Pais(pais, null, 0, 0));
        Pais paisObj = (Pais) consultaPais.next();
        pais = paisObj.getCodigo_pais();
        

        ObjectSet consultaTitulo = AcademiaWeb.Base.get(new Titulo(null, titulo_tra));
        Titulo titulo = (Titulo) consultaTitulo.next();
        titulo_tra = titulo.getCod_titulo();

        
        Date fecha = formatoFecha.parse(fecha_cobro);
        Crear.Fecha(fecha);
        
        ObjectSet consultaIdPro = AcademiaWeb.Base.get(new Profesor(null, null, id_tra, null, null, 0,null, null, null, null, null, null));
        ObjectSet consultaIdGer = AcademiaWeb.Base.get(new Gerente(null, id_tra, null, null, 0, null, null, null, null, null, null));
        
        if (!(consultaIdPro.isEmpty() && consultaIdGer.isEmpty())) {
            messageError.add("YA EXISTE LA ID DE TRABAJADOR ");
            error = true;
        }
        
        ObjectSet buscarGerente = AcademiaWeb.Base.get(new Gerente(null, id_tra, null, null, 0, null, null, null, null, null, null));
        if (buscarGerente.isEmpty()) {
            messageError.add("NO EXISTE EL GERENTE");
            error = true;
        }
        
        ObjectSet buscarEspecialidad = AcademiaWeb.Base.get(new Especialidad(null, especialidad));
        if (!(buscarEspecialidad.isEmpty())) {
            messageError.add("NO EXISTE EL GERENTE");
            error = true;
        } else {
            Especialidad espe = (Especialidad) buscarEspecialidad.next();
            especialidad = espe.getCodigo_esp();
        }
      
        if (error) {
            JOptionPane.showMessageDialog(null, messageError.get(0));
            messageError.clear();
        } else {
            AcademiaWeb.Base.set(new Profesor(especialidad, id_gerente, id_tra, titulo_tra, fecha_cobro, sueldo, cedula, nombre, apellido, pais, correo, password));
        }
                
        return error;
    }
    
    public static boolean Gerentes(String tipo, String id_tra, String titulo_tra, String fecha_tra, double sueldo_tra, String cedula, String nombre_per, String apellido_per, String pais, String correo_per, String password_per) throws ParseException {
        
        ObjectSet consultaIdPro = AcademiaWeb.Base.get(new Profesor(null, null, id_tra, null, null, 0,null, null, null, null, null, null));
        ObjectSet consultaIdGer = AcademiaWeb.Base.get(new Gerente(null, id_tra, null, null, 0, null, null, null, null, null, null));
        
        if (!(consultaIdPro.isEmpty() && consultaIdGer.isEmpty())) {
            messageError.add("YA EXISTE LA ID DE TRABAJADOR ");
            error = true;
        }
        
        ObjectSet consultaTitulo = AcademiaWeb.Base.get(new Titulo(null, titulo_tra));
        Titulo titulo = (Titulo) consultaTitulo.next();
        titulo_tra = titulo.getCod_titulo();
        
        Date fecha = formatoFecha.parse(fecha_tra);
        Crear.Fecha(fecha);

        ObjectSet consultaCedulaEst = AcademiaWeb.Base.get(new Estudiante(null, null, cedula, null, null, null, null ,null));
        ObjectSet consultaCedulaPro = AcademiaWeb.Base.get(new Profesor(null, null, null, null, null, 0,cedula, null, null, null, null, null));
        ObjectSet consultaCedulaGer = AcademiaWeb.Base.get(new Gerente(null, null, null, null, 0, cedula, null, null, null, null, null));
        
        if (!(consultaCedulaEst.isEmpty() && consultaCedulaPro.isEmpty() && consultaCedulaGer.isEmpty())) {
            messageError.add("YA EXISTE LA CEDULA");
            error = true;
        }
        
        ObjectSet consultaPais = AcademiaWeb.Base.get(new Pais(pais, null, 0, 0));
        Pais paisObj = (Pais) consultaPais.next();
        pais = paisObj.getCodigo_pais();
        
        if (error) {
            JOptionPane.showMessageDialog(null, messageError.get(0));
            messageError.clear();
        } else {
            AcademiaWeb.Base.set(new Gerente(tipo, id_tra, titulo_tra, fecha_tra, sueldo_tra, cedula, nombre_per, apellido_per, pais, correo_per, password_per));
        }
        
        return error;
    }


}
