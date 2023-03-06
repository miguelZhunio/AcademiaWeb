package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Especialidad {
    private String codigo_esp;
    private String nombre_esp;

    public Especialidad() {
        
    }
    

    public Especialidad(String codigo_esp, String nombre_esp) {
        this.codigo_esp = codigo_esp;
        this.nombre_esp = nombre_esp;
    }

    /**
     * @return the codigo_esp
     */
    public String getCodigo_esp() {
        return codigo_esp;
    }

    /**
     * @param codigo_esp the codigo_esp to set
     */
    public void setCodigo_esp(String codigo_esp) {
        this.codigo_esp = codigo_esp;
    }

    /**
     * @return the nombre_esp
     */
    public String getNombre_esp() {
        return nombre_esp;
    }

    /**
     * @param nombre_esp the nombre_esp to set
     */
    public void setNombre_esp(String nombre_esp) {
        this.nombre_esp = nombre_esp;
    }
    
}
