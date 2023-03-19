
public class ConvTemperatura {
    
    private Temperatura tempBase;
    
    public ConvTemperatura(Temperatura tempBase) {
        this.tempBase = tempBase;
    }

    public String convertirCaF(Double temp) {
        return "Temperatura: " + (temp*1.8 + 32);
    }
    
    public String convertirCaK(Double temp) {
        return "Temperatura: " + (temp + 273.15);
    }
    
    public String convertirFaC(Double temp) {
        return "Temperatura: " + ((temp-32)/1.8);
    }
    
    public String convertirFaK(Double temp) {
        return "Temperatura: " + ((temp+459.67)*(5/9));
    }
    
    public String convertirKaC(Double temp) {
        return "Temperatura: " + (temp-273.15);
    }
    
    public String convertirKaF(Double temp) {
        return "Temperatura: " + ((temp*9/5)-459.67);
    }
}
