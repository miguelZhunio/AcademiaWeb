package clases;

/**
 *
 * @author  Zhunio Miguel
 */
public class Pais {
    private String codigo_pais;
    private String nombre_pais;
    private int numero_hab;
    private int num_est;

    public Pais() {
        
    }

    public Pais(String codigo_pais, String nombre_pais, int numero_hab, int num_est) {
        this.codigo_pais = codigo_pais;
        this.nombre_pais = nombre_pais;
        this.numero_hab = numero_hab;
        this.num_est = num_est;
    }

    /**
     * @return the codigo_pais
     */
    public String getCodigo_pais() {
        return codigo_pais;
    }

    /**
     * @param codigo_pais the codigo_pais to set
     */
    public void setCodigo_pais(String codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    /**
     * @return the nombre_pais
     */
    public String getNombre_pais() {
        return nombre_pais;
    }

    /**
     * @param nombre_pais the nombre_pais to set
     */
    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    /**
     * @return the numero_hab
     */
    public int getNumero_hab() {
        return numero_hab;
    }

    /**
     * @param numero_hab the numero_hab to set
     */
    public void setNumero_hab(int numero_hab) {
        this.numero_hab = numero_hab;
    }

    /**
     * @return the num_est
     */
    public int getNum_est() {
        return num_est;
    }

    /**
     * @param num_est the num_est to set
     */
    public void setNum_est(int num_est) {
        this.num_est = num_est;
    }
    
    
    
}
