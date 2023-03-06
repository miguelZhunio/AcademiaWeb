package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Calidad {
    private String cod_cal;
    private String valor_cal;

    public Calidad() {
        
    }
 
    public Calidad(String cod_cal, String valor_cal) {
        this.cod_cal = cod_cal;
        this.valor_cal = valor_cal;
    }
    
    /**
     * @return the cod_cal
     */
    public String getCod_cal() {
        return cod_cal;
    }

    /**
     * @param cod_cal the cod_cal to set
     */
    public void setCod_cal(String cod_cal) {
        this.cod_cal = cod_cal;
    }

    /**
     * @return the valor_cal
     */
    public String getValor_cal() {
        return valor_cal;
    }

    /**
     * @param valor_cal the valor_cal to set
     */
    public void setValor_cal(String valor_cal) {
        this.valor_cal = valor_cal;
    }
    
    
}
