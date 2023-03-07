package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Trabajador extends Persona{
    private String id_trabajador;
    private String titulo_tra;
    private String fecha_tra;
    private double sueldo_tra;

    public Trabajador() {
        super();
    }

    public Trabajador(String id_trabajador, String titulo_tra, String fecha_tra, double sueldo_tra) {
        this.id_trabajador = id_trabajador;
        this.titulo_tra = titulo_tra;
        this.fecha_tra = fecha_tra;
        this.sueldo_tra = sueldo_tra;
    }

    public Trabajador(String id_trabajador, String titulo_tra, String fecha_tra, double sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String codigo_pais, String correo_per, String password_per) {
        super(cedula_per, nombre_per, apellido_per, codigo_pais, correo_per, password_per);
        this.id_trabajador = id_trabajador;
        this.titulo_tra = titulo_tra;
        this.fecha_tra = fecha_tra;
        this.sueldo_tra = sueldo_tra;
    }
    /**
     * @return the id_trabajador
     */
    public String getId_trabajador() {
        return id_trabajador;
    }

    /**
     * @param id_trabajador the id_trabajador to set
     */
    public void setId_trabajador(String id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    /**
     * @return the titulo_tra
     */
    public String getTitulo_tra() {
        return titulo_tra;
    }

    /**
     * @param titulo_tra the titulo_tra to set
     */
    public void setTitulo_tra(String titulo_tra) {
        this.titulo_tra = titulo_tra;
    }

    /**
     * @return the fecha_tra
     */
    public String getFecha_tra() {
        return fecha_tra;
    }

    /**
     * @param fecha_tra the fecha_tra to set
     */
    public void setFecha_tra(String fecha_tra) {
        this.fecha_tra = fecha_tra;
    }

    /**
     * @return the sueldo_tra
     */
    public double getSueldo_tra() {
        return sueldo_tra;
    }

    /**
     * @param sueldo_tra the sueldo_tra to set
     */
    public void setSueldo_tra(double sueldo_tra) {
        this.sueldo_tra = sueldo_tra;
    }

 
    
    
}
