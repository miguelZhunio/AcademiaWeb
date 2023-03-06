package clases;

import java.util.Date;

/**
 *
 * @author Zhunio
 */
public class Fecha {
    private String cod_fec;
    private Date fecha;

    public Fecha() {
        
    }

    public Fecha(String cod_fec, Date fecha) {
        this.cod_fec = cod_fec;
        this.fecha = fecha;
    }

    /**
     * @return the cod_fec
     */
    public String getCod_fec() {
        return cod_fec;
    }

    /**
     * @param cod_fec the cod_fec to set
     */
    public void setCod_fec(String cod_fec) {
        this.cod_fec = cod_fec;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
