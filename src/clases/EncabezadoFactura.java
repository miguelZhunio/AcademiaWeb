package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class EncabezadoFactura {
    private String codigo_det;
    private String fecha;
    private double iva;
    private double precio_final;
    private double descuento;
    private double subtotal;
    private String cedula_est;

    public EncabezadoFactura() {
        
    }

    public EncabezadoFactura(String codigo_det, String fecha, double iva, double precio_final, double descuento, double subtotal, String cedula_est) {
        this.codigo_det = codigo_det;
        this.fecha = fecha;
        this.iva = iva;
        this.precio_final = precio_final;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.cedula_est = cedula_est;
    }
    

    /**
     * @return the codigo_det
     */
    public String getCodigo_det() {
        return codigo_det;
    }

    /**
     * @param codigo_det the codigo_det to set
     */
    public void setCodigo_det(String codigo_det) {
        this.codigo_det = codigo_det;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the precio_final
     */
    public double getPrecio_final() {
        return precio_final;
    }

    /**
     * @param precio_final the precio_final to set
     */
    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
    
}
