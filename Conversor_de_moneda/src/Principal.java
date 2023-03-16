
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class Principal {

    public static void main(String[] args) {

        // Para que el programa se ejecute hasta que el usuario decida
        boolean ejecutar = true;

        // Creando instancias de monedas con tasa de cambio al 15 marzo 2023
        Moneda sol = new Moneda("Sol peruano", "PEN", 1.0);
        Moneda usd = new Moneda("Dólar estadounidense", "USD", 3.79);
        Moneda eur = new Moneda("Euro", "EUR", 4.02);
        Moneda gbp = new Moneda("Libra esterlina", "GBP", 4.58);
        Moneda jpy = new Moneda("Yen japones", "JPY", 0.029);
        Moneda krw = new Moneda("Won surcoreano", "KRW", 0.0029);

        // Creando instancia del conversor con la moneda base en SOL peruano
        ConvMoneda convMoneda = new ConvMoneda(sol);

        // Definiendo las opciones de conversion
        String[] opcionesConv = {
            "Conversor de Moneda",
            "Conversor de Temperatura"
        };

        while (ejecutar) {
            // Recibimos la opcion de conversor elegida
            String opcConv = (String) JOptionPane.showInputDialog(null,
                    "Seleccione una opcion", "Menu", JOptionPane.DEFAULT_OPTION, null,
                    opcionesConv, opcionesConv[0]);

            switch (opcConv) {
                // Caso conversor de monedas
                case "Conversor de Moneda":
                    boolean valido = false;
                    Double cantidad = 0.0;
                    String cantConv = "";

                    //Recibimos y verificamos la cantidad de dinero a convertir
                    while (!valido) {
                        String input = (String) JOptionPane.showInputDialog(null,
                                "Ingrese la cantidad de dinero que deseas convertir:",
                                "Input", JOptionPane.QUESTION_MESSAGE);
                        try {
                            cantidad = Double.valueOf(input);
                            valido = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Error: Ingrese una cantidad numérico válido",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    //Definiendo las opciones de conversion
                    String[] opcionesConvMon = {
                        "De Soles a Dólar",
                        "De Soles a Euro",
                        "De Soles a Libras",
                        "De Soles a Yen",
                        "De Soles a Won Coreano",
                        "De Dólar a Soles",
                        "De Euro a Soles",
                        "De Libras a Soles",
                        "De Yen a Soles",
                        "De Won Coreano a Soles",};

                    //Seleccion del tipo de moneda origen y destino para la conversion
                    String opcTipo = (String) JOptionPane.showInputDialog(null,
                            "Elige la moneda a la que decides convertir tu dinero:",
                            "Monedas", JOptionPane.DEFAULT_OPTION, null,
                            opcionesConvMon, opcionesConvMon[0]);

                    switch (opcTipo) {
                        case "De Soles a Dólar":
                            cantConv = convMoneda.convertir(cantidad, sol, usd);
                            break;
                        case "De Soles a Euro":
                            cantConv = convMoneda.convertir(cantidad, sol, eur);
                            break;
                        case "De Soles a Libras":
                            cantConv = convMoneda.convertir(cantidad, sol, gbp);
                            break;
                        case "De Soles a Yen":
                            cantConv = convMoneda.convertir(cantidad, sol, jpy);
                            break;
                        case "De Soles a Won Coreano":
                            cantConv = convMoneda.convertir(cantidad, sol, krw);
                            break;
                        case "Dólar a Soles":
                            cantConv = convMoneda.convertir(cantidad, usd, sol);
                            break;
                        case "De Euro a Soles":
                            cantConv = convMoneda.convertir(cantidad, eur, sol);
                            break;
                        case "De Libras a Soles":
                            cantConv = convMoneda.convertir(cantidad, gbp, sol);
                            break;
                        case "De Yen a Soles":
                            cantConv = convMoneda.convertir(cantidad, jpy, sol);
                            break;
                        case "De Won Coreano a Soles":
                            cantConv = convMoneda.convertir(cantidad, krw, sol);
                            break;
                    }

                    // Mostrando el resultado de la conversion
                    JOptionPane.showMessageDialog(null, cantConv, "Message",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;

                // Caso conversor de temperatura
                case "Conversor de Temperatura":
                    System.out.println("temp");
                    break;
            }

            // Para confirmar si continua el programa
            Integer opcCont = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

            if (JOptionPane.OK_OPTION == opcCont) {
                System.out.println("Si continua");
            } else {
                ejecutar = false;
                JOptionPane.showMessageDialog(null, "Programa terminado");
            }
        }
    }

}
