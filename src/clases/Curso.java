package clases;

import java.sql.Time;

/**
 *
 * @author Zhunio Miguel
 */
public class Curso {
    
    private String codigo_curso;
    private String nombre_cur;
    private Time duracion;
    private double precio_cur;
    private String temario_cur;
    private String descripcion_cur;
    private String id_pro;
    private String id_car;

    public Curso() {
    }

    public Curso(String codigo_curso, String nombre_cur, Time duracion, double precio_cur, String temario_cur, String descripcion_cur, String id_pro, String id_car) {
        this.codigo_curso = codigo_curso;
        this.nombre_cur = nombre_cur;
        this.duracion = duracion;
        this.precio_cur = precio_cur;
        this.temario_cur = temario_cur;
        this.descripcion_cur = descripcion_cur;
        this.id_pro = id_pro;
        this.id_car = id_car;
    }

    /**
     * @return the codigo_curso
     */
    public String getCodigo_curso() {
        return codigo_curso;
    }

    /**
     * @param codigo_curso the codigo_curso to set
     */
    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    /**
     * @return the nombre_cur
     */
    public String getNombre_cur() {
        return nombre_cur;
    }

    /**
     * @param nombre_cur the nombre_cur to set
     */
    public void setNombre_cur(String nombre_cur) {
        this.nombre_cur = nombre_cur;
    }

    /**
     * @return the duracion
     */
    public Time getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the precio_cur
     */
    public double getPrecio_cur() {
        return precio_cur;
    }

    /**
     * @param precio_cur the precio_cur to set
     */
    public void setPrecio_cur(double precio_cur) {
        this.precio_cur = precio_cur;
    }

    /**
     * @return the temario_cur
     */
    public String getTemario_cur() {
        return temario_cur;
    }

    /**
     * @param temario_cur the temario_cur to set
     */
    public void setTemario_cur(String temario_cur) {
        this.temario_cur = temario_cur;
    }

    /**
     * @return the descripcion_cur
     */
    public String getDescripcion_cur() {
        return descripcion_cur;
    }

    /**
     * @param descripcion_cur the descripcion_cur to set
     */
    public void setDescripcion_cur(String descripcion_cur) {
        this.descripcion_cur = descripcion_cur;
    }

    /**
     * @return the id_pro
     */
    public String getId_pro() {
        return id_pro;
    }

    /**
     * @param id_pro the id_pro to set
     */
    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }

    /**
     * @return the id_car
     */
    public String getId_car() {
        return id_car;
    }

    /**
     * @param id_car the id_car to set
     */
    public void setId_car(String id_car) {
        this.id_car = id_car;
    }
    
}
