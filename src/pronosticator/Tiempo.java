package pronosticator;

/**
 * Clase que guarda el tiempo para cada ciudad.
 * 
 * @author Alberto Lagos T.
 */
public class Tiempo {
    private String fecha[];
    private Double tMax[];
    private Double tMin[];
    private String descripcion[];
    private String imagen[];

    /**
     * Constructor de la clase.
     *
     * @param fecha
     * @param tMax
     * @param tMin
     * @param descripcion
     * @param imagen
     */
    public Tiempo(String fecha[], Double tMax[], Double tMin[], String descripcion[], String imagen[]) {
        this.fecha = fecha;
        this.tMax  = tMax;
        this.tMin  = tMin;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Metodo para obtener la fecha (getter)
     *
     * @return String[]
     */
    public String[] obtenerFecha() {
        return fecha;
    }

    /**
     * Metodo para obtener los pronosticos (getter).
     *
     * @return String[]
     */
    public String[] obtenerPronostico() {
        return descripcion;
    }


    /**
     * Metodo para obtener las temperaturas maximas (getter).
     *
     * @return Double[]
     */
    public Double[] obtenerTemperaturaMax() {
        return tMax;
    }

    /**
     * Metodo para obtener las temperaturas minimas (getter).
     *
     * @return Double[]
     */
    public Double[] obtenerTemperaturaMin() {
        return tMin;
    }


    /**
     * Metodo para obtener los iconos asociados a un tiempo (que son para 4 dias) determinado (getter)
     *
     * @return String[]
     */
    public String[] obtenerIconos() {
        return imagen;
    }
}
