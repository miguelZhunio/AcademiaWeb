package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Empresa {
    private String ruc;
    private String nombre_emp;
    private String contacto;
    private String nombreComercial;
    private String dueno;
    private String direccion;
    private String id_ger;

    public Empresa() {
        
    }

    public Empresa(String ruc, String nombre_emp, String contacto, String nombreComercial, String dueno, String direccion, String id_ger) {
        this.ruc = ruc;
        this.nombre_emp = nombre_emp;
        this.contacto = contacto;
        this.nombreComercial = nombreComercial;
        this.dueno = dueno;
        this.direccion = direccion;
        this.id_ger = id_ger;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the nombre_emp
     */
    public String getNombre_emp() {
        return nombre_emp;
    }

    /**
     * @param nombre_emp the nombre_emp to set
     */
    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the nombreComercial
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * @param nombreComercial the nombreComercial to set
     */
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    /**
     * @return the dueno
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the id_ger
     */
    public String getId_ger() {
        return id_ger;
    }

    /**
     * @param id_ger the id_ger to set
     */
    public void setId_ger(String id_ger) {
        this.id_ger = id_ger;
    }
    
    
    
}
