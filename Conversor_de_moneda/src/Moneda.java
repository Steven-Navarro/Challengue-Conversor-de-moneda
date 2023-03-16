
public class Moneda {
    private String nombre;
    private String simbolo;
    private Double tasaCambio;

    public Moneda(String nombre, String simbolo, Double tasaCambio) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tasaCambio = tasaCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(Double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
    
}
