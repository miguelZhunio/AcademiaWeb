package validaciones;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.util.Date;

/**
 *
 * @author PC01
 */
public class AcademiaWeb {
    public static ObjectContainer Base = Db4o.openFile("//home//vaioz//NetBeansProjects//AcademiaWeb.yap");


    public static void main(String [] args) {
        // ObjectContainer Base = Db4o.openFile("//home//vaioz//NetBeansProjects//AcademiaWeb.yap");
        
        IngresoNivel.NuevoNivel();
    }
   
        
    
}
