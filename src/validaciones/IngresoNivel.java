package validaciones;

import clases.Nivel;

/**
 *
 * @author Zhunio Miguel
 */
public class IngresoNivel {
    
    public static void NuevoNivel() {
        AcademiaWeb.Base.set(new Nivel("1", "Basico"));
        AcademiaWeb.Base.set(new Nivel("2", "Intermedio"));
        AcademiaWeb.Base.set(new Nivel("3", "Avanzado"));
        
    }
    
}
