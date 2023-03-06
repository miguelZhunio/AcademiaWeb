package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Estudiante extends Persona{
    private String fecha_ins;
    private String nivel_est;

    public Estudiante() {
        
    }

    public Estudiante(String fecha_ins, String nivel_est) {
        this.fecha_ins = fecha_ins;
        this.nivel_est = nivel_est;
    }

    public Estudiante(String fecha_ins, String nivel_est, String cedula_per, String nombre_per, String apellido_per, String codigo_pais, String correo_per, String password_per) {
        super(cedula_per, nombre_per, apellido_per, codigo_pais, correo_per, password_per);
        this.fecha_ins = fecha_ins;
        this.nivel_est = nivel_est;
    }

    /**
     * @return the fecha_ins
     */
    public String getFecha_ins() {
        return fecha_ins;
    }

    /**
     * @param fecha_ins the fecha_ins to set
     */
    public void setFecha_ins(String fecha_ins) {
        this.fecha_ins = fecha_ins;
    }

    /**
     * @return the nivel_est
     */
    public String getNivel_est() {
        return nivel_est;
    }

    /**
     * @param nivel_est the nivel_est to set
     */
    public void setNivel_est(String nivel_est) {
        this.nivel_est = nivel_est;
    }
    
    
}
