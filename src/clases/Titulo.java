package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Titulo {
    private String cod_titulo;
    private String nombr_tit;

    public Titulo() {
        
    }

    public Titulo(String cod_titulo, String nombr_tit) {
        this.cod_titulo = cod_titulo;
        this.nombr_tit = nombr_tit;
    }
    

    /**
     * @return the cod_titulo
     */
    public String getCod_titulo() {
        return cod_titulo;
    }

    /**
     * @param cod_titulo the cod_titulo to set
     */
    public void setCod_titulo(String cod_titulo) {
        this.cod_titulo = cod_titulo;
    }

    /**
     * @return the nombr_tit
     */
    public String getNombr_tit() {
        return nombr_tit;
    }

    /**
     * @param nombr_tit the nombr_tit to set
     */
    public void setNombr_tit(String nombr_tit) {
        this.nombr_tit = nombr_tit;
    }
}
