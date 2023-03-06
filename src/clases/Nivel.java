package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Nivel {
    private String codigo_nivel;
    private String nivel;

    public Nivel() {
        
    }

    public Nivel(String codigo_nivel, String nivel) {
        this.codigo_nivel = codigo_nivel;
        this.nivel = nivel;
    }

    /**
     * @return the codigo_nivel
     */
    public String getCodigo_nivel() {
        return codigo_nivel;
    }

    /**
     * @param codigo_nivel the codigo_nivel to set
     */
    public void setCodigo_nivel(String codigo_nivel) {
        this.codigo_nivel = codigo_nivel;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
