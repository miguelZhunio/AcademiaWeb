package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Carrera {
    private String id_car;
    private String titulo_car;
    private String duracion_car;

    public Carrera() {
        
    }
    
    

    public Carrera(String id_car, String titulo_car, String duracion_car) {
        this.id_car = id_car;
        this.titulo_car = titulo_car;
        this.duracion_car = duracion_car;
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

    /**
     * @return the titulo_car
     */
    public String getTitulo_car() {
        return titulo_car;
    }

    /**
     * @param titulo_car the titulo_car to set
     */
    public void setTitulo_car(String titulo_car) {
        this.titulo_car = titulo_car;
    }

    /**
     * @return the duracion_car
     */
    public String getDuracion_car() {
        return duracion_car;
    }

    /**
     * @param duracion_car the duracion_car to set
     */
    public void setDuracion_car(String duracion_car) {
        this.duracion_car = duracion_car;
    }
    
    
}
