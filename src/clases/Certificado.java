package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Certificado {
    
    private String id_car;
    private String cedula_est;
    private String message_cer;
    private String fecha_cer;

    public Certificado() {
        
    }

    public Certificado(String id_car, String cedula_est, String message_cer, String fecha_cer) {
        this.id_car = id_car;
        this.cedula_est = cedula_est;
        this.message_cer = message_cer;
        this.fecha_cer = fecha_cer;
    }
    
    

    /**
     * @return the id_car
     */
    public String getId_car() {
        return id_car;
    }

    /**
     * @param id_car the id_car to set
     */
    public void setId_car(String id_car) {
        this.id_car = id_car;
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
     * @return the message_cer
     */
    public String getMessage_cer() {
        return message_cer;
    }

    /**
     * @param message_cer the message_cer to set
     */
    public void setMessage_cer(String message_cer) {
        this.message_cer = message_cer;
    }

    /**
     * @return the fecha_cer
     */
    public String getFecha_cer() {
        return fecha_cer;
    }

    /**
     * @param fecha_cer the fecha_cer to set
     */
    public void setFecha_cer(String fecha_cer) {
        this.fecha_cer = fecha_cer;
    }
    
    
}
