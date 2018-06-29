package lcd.printer;


import lcd.logic.DigitSize;
import lcd.logic.Digit;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Camila Buitrago
 */

public class LCDPrinter {

    private DigitSize size;

    /**
     *
     * Metodo encargado de procesar la entrada que contiene el size del segmento
     * de los digitos y los digitos a imprimir
     *
     * @param comando Entrada que contiene el size del segmento de los digitos y
     * el numero a imprimir
     * @param espacioDig Espacio entre digitos
     * @return Lista con las matrices de siete segmentos.
     */
    public ArrayList<char[][]> procesar(String comando, int espacioDig) {
        String[] parametros;
        if (!comando.contains(",")) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene caracter ,");
        }
        //Se hace el split de la cadena
        parametros = comando.split(",");
        //Valida la cantidad de parametros
        if (parametros.length > 2) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " contiene mas caracter ,");
        }
        //Valida la cantidad de parametros
        if (parametros.length < 2) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene los parametros requeridos");
        }
        //Valida que el parametro size sea un numerico
        
        if (isNumeric(parametros[0])) {
            this.size = new DigitSize(Integer.parseInt(parametros[0]));
        } else {
            throw new IllegalArgumentException("Parametro Size [" + parametros[0]
                    + "] no es un numero");
        }
        char[] digits = parametros[1].toCharArray();
        ArrayList<char[][]> digitsToPrint = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            char[][] digit = new Digit(digits[i] - '0', this.size.getSize()).getMatrix();
            digitsToPrint.add(digit);
        }
        return digitsToPrint;
    }
    
    public void print(String comando, int espacioDig) {
        ArrayList<char[][]> digitsToPrint = this.procesar(comando, 0);
        int height = this.size.getHeight();
        for (int i = 0; i < height; i++) {
            Iterator<char[][]> iterator = digitsToPrint.iterator();
            while (iterator.hasNext()) {
                char[][] digit = iterator.next();
                for (int j = 0; j < digit[i].length; j++) {
                    System.out.print(digit[i][j]);
                }
                for (int j = 0; j < espacioDig; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    /**
     *
     * Metodo encargado de validar si una cadena es numerica.
     *
     * @param cadena Cadena
     * @return Retorna true si la cadena es un numero.
     */
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
