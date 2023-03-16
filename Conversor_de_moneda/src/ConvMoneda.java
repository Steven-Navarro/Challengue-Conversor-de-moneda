
public class ConvMoneda {

    private Moneda monedaBase;
    
    public ConvMoneda(Moneda monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String convertir(double cantidad, Moneda monedaOrigen, Moneda monedaDestino) {
        double cantidadEnSoles = cantidad / monedaOrigen.getTasaCambio();
        double cantidadDestino = cantidadEnSoles * monedaDestino.getTasaCambio();
        return "Tiene " + cantidadDestino + " " + monedaDestino.getSimbolo();
    }

}
