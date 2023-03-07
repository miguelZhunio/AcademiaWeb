package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Gerente extends Trabajador{
    private String tipo;

    public Gerente(String tipo) {
        this.tipo = tipo;
    }

    public Gerente(String tipo, String id_trabajador, String titulo_tra, String fecha_tra, double sueldo_tra) {
        super(id_trabajador, titulo_tra, fecha_tra, sueldo_tra);
        this.tipo = tipo;
    }

    public Gerente(String tipo, String id_trabajador, String titulo_tra, String fecha_tra, double sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String codigo_pais, String correo_per, String password_per) {
        super(id_trabajador, titulo_tra, fecha_tra, sueldo_tra, cedula_per, nombre_per, apellido_per, codigo_pais, correo_per, password_per);
        this.tipo = tipo;
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
