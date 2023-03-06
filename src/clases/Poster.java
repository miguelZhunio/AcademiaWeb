package clases;

/**
 *
 * @author Zhunio Miguel
 * 
 */
public class Poster {
    private String codig_pos;
    private String contenido_pos;
    private String fecha_pos;
    private String id_pro;

    public Poster() {
        
    }

    public Poster(String codig_pos, String contenido_pos, String fecha_pos, String id_pro) {
        this.codig_pos = codig_pos;
        this.contenido_pos = contenido_pos;
        this.fecha_pos = fecha_pos;
        this.id_pro = id_pro;
    }

    /**
     * @return the codig_pos
     */
    public String getCodig_pos() {
        return codig_pos;
    }

    /**
     * @param codig_pos the codig_pos to set
     */
    public void setCodig_pos(String codig_pos) {
        this.codig_pos = codig_pos;
    }

    /**
     * @return the contenido_pos
     */
    public String getContenido_pos() {
        return contenido_pos;
    }

    /**
     * @param contenido_pos the contenido_pos to set
     */
    public void setContenido_pos(String contenido_pos) {
        this.contenido_pos = contenido_pos;
    }

    /**
     * @return the fecha_pos
     */
    public String getFecha_pos() {
        return fecha_pos;
    }

    /**
     * @param fecha_pos the fecha_pos to set
     */
    public void setFecha_pos(String fecha_pos) {
        this.fecha_pos = fecha_pos;
    }

    /**
     * @return the id_pro
     */
    public String getId_pro() {
        return id_pro;
    }

    /**
     * @param id_pro the id_pro to set
     */
    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }
    
    
}
