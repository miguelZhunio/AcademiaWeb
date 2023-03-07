package validaciones;

import clases.Fecha;
import clases.Pais;
import com.db4o.ObjectSet;
import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Crear {
    public static String Fecha(Date fecha) {
        int aux;
        String auxCodigo = "";  
        Fecha auxFecha;
        
        ObjectSet consultaFecha = AcademiaWeb.Base.get(new Fecha(null, fecha));
        
        if (consultaFecha.isEmpty()) {
            ObjectSet verificarUltimo = AcademiaWeb.Base.get(new Fecha(null, null));
            auxFecha = (Fecha) verificarUltimo.next();
            
            aux = Integer.parseInt(auxFecha.getCod_fec());
            aux +=1;
            
            auxCodigo = String.valueOf(aux);
            
            AcademiaWeb.Base.set(new Fecha(auxCodigo, fecha));
        } else {
            auxFecha = (Fecha) consultaFecha.next();
            auxCodigo = auxFecha.getCod_fec();
        }
        
        return auxCodigo;
    }
}
