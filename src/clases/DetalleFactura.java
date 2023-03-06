package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class DetalleFactura {
    private String cod_detalle;
    private String cod_enc;
    private String codigo_cur;
    private int cantidad;
    private double valor;

    public DetalleFactura() {
        
    }
  
    public DetalleFactura(String cod_detalle, String cod_enc, String codigo_cur, int cantidad, double valor) {
        this.cod_detalle = cod_detalle;
        this.cod_enc = cod_enc;
        this.codigo_cur = codigo_cur;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    
    
    /**
     * @return the cod_detalle
     */
    public String getCod_detalle() {
        return cod_detalle;
    }

    /**
     * @param cod_detalle the cod_detalle to set
     */
    public void setCod_detalle(String cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    /**
     * @return the cod_enc
     */
    public String getCod_enc() {
        return cod_enc;
    }

    /**
     * @param cod_enc the cod_enc to set
     */
    public void setCod_enc(String cod_enc) {
        this.cod_enc = cod_enc;
    }

    /**
     * @return the codigo_cur
     */
    public String getCodigo_cur() {
        return codigo_cur;
    }

    /**
     * @param codigo_cur the codigo_cur to set
     */
    public void setCodigo_cur(String codigo_cur) {
        this.codigo_cur = codigo_cur;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
