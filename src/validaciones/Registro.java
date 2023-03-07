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
        
        ObjectSet consultaCedulaEst = AcademiaWeb.Base.get(new Estudiante(cedula, null, null, null, null, null, null ,null));
        ObjectSet consultaCedulaPro = AcademiaWeb.Base.get(new Profesor(null, null, null, null, null, 0,cedula, null, null, null, null, null));
        ObjectSet consultaCedulaGer = AcademiaWeb.Base.get(new Gerente());
        
        if (!(consultaCedulaEst.isEmpty() && consultaCedulaPro.isEmpty() && consultaCedulaGer.isEmpty())) {
            messageError.add("YA EXISTE LA CEDULA");
            error = true;
        }
 
        
        if (!(nombre.matches("[a-zA-Z]{5,60}"))) {
            messageError.add("NOMBRE NO VALIDO");
            error = true;
        } 
        
        if (!(apellido.matches("[a-zA-Z]{10,60}"))) {
            messageError.add("APELLIDO NO VALIDO");
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
        ObjectSet consultaCedulaGer = AcademiaWeb.Base.get(new Gerente());
        
        if (!(consultaCedulaEst.isEmpty() && consultaCedulaPro.isEmpty() && consultaCedulaGer.isEmpty())) {
            messageError.add("YA EXISTE LA CEDULA");
            error = true;
        }
        
        if (!(nombre.matches("[a-zA-Z]{5,60}"))) {
            messageError.add("NOMBRE NO VALIDO");
            error = true;
        } 
        
        if (!(apellido.matches("[a-zA-Z]{10,60}"))) {
            messageError.add("APELLIDO NO VALIDO");
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
        
        Date fecha = formatoFecha.parse(fecha_cobro);
        Crear.Fecha(fecha);
        
        ObjectSet consultaIdPro = AcademiaWeb.Base.get(new Profesor(null, null, id_tra, null, null, 0,null, null, null, null, null, null));
        ObjectSet consultaIdGer = AcademiaWeb.Base.get(new Gerente());
        
        if (!(consultaIdPro.isEmpty() && consultaIdGer.isEmpty())) {
            messageError.add("YA EXISTE LA ID DE TRABAJADOR ");
            error = true;
        }
        
        ObjectSet buscarEspecialidad = AcademiaWeb.Base.get(new Gerente());
        if (!(buscarEspecialidad.isEmpty())) {
            
        }
        
        if (error) {
            JOptionPane.showMessageDialog(null, messageError.get(0));
            messageError.clear();
        } else {
            AcademiaWeb.Base.set(new Profesor(especialidad, id_gerente, id_tra, titulo_tra, fecha_cobro, sueldo, cedula, nombre, apellido, pais, correo, password));
        }
        
        Profesor profe;
        
        return error;
    }
}
