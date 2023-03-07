package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Comentar {
    private String cedula_est;
    private String codigo_pos;
    private String contenido_cont;
    private String fecha_con;

    public Comentar() {
        
    }

    public Comentar(String cedula_est, String codigo_pos, String contenido_cont, String fecha_con) {
        this.cedula_est = cedula_est;
        this.codigo_pos = codigo_pos;
        this.contenido_cont = contenido_cont;
        this.fecha_con = fecha_con;
    }
    

    /**
     * @return the cedula_est
     */
    public String getCedula_est() {
        return cedula_est;
    }

    /**
     * @param cedula_est the cedula_est to set
     */
    public void setCedula_est(String cedula_est) {
        this.cedula_est = cedula_est;
    }

    /**
     * @return the codigo_pos
     */
    public String getCodigo_pos() {
        return codigo_pos;
    }

    /**
     * @param codigo_pos the codigo_pos to set
     */
    public void setCodigo_pos(String codigo_pos) {
        this.codigo_pos = codigo_pos;
    }

    /**
     * @return the contenido_cont
     */
    public String getContenido_cont() {
        return contenido_cont;
    }

    /**
     * @param contenido_cont the contenido_cont to set
     */
    public void setContenido_cont(String contenido_cont) {
        this.contenido_cont = contenido_cont;
    }

    /**
     * @return the fecha_con
     */
    public String getFecha_con() {
        return fecha_con;
    }

    /**
     * @param fecha_con the fecha_con to set
     */
    public void setFecha_con(String fecha_con) {
        this.fecha_con = fecha_con;
    }
            
}
