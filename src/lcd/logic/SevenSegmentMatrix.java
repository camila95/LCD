package lcd.logic;

import lcd.logic.DigitSize;

/**
 * Clase que emula un componente electrónico "Siete Segmentos" representando su
 * funcionamiento en una matriz de caracteres.
 * 
 * Descripción de los segmentos:
 * 
 *               A
 *              ---- 
 *            F|  G | B
 *              ----
 *            E|    | C
 *              ----
 *                D
 * 
 * 
 * @author Camila Buitrago
 */
public class SevenSegmentMatrix {

    public static final int SEGEMENT_A = 0;
    public static final int SEGEMENT_B = 1;
    public static final int SEGEMENT_C = 2;
    public static final int SEGEMENT_D = 3;
    public static final int SEGEMENT_E = 4;
    public static final int SEGEMENT_F = 5;
    public static final int SEGEMENT_G = 6;

    private static final char DEFAULT_EMPTY_CHAR = ' ';
    private static final char DEFAULT_HORIZONTAL_CHAR = '-';
    private static final char DEFAULT_VERTICAL_CHAR = '|';

    private char[][] matrix;
    private final DigitSize size;

    public SevenSegmentMatrix(int size) {
        this.size = new DigitSize(size);
        this.fillMatrix();
    }

    /*
    * Metodo que inicializa la matriz con el valor por omisión.
    */
    private void fillMatrix() {
        this.matrix = new char[this.size.getHeight()][this.size.getWidth()];
        for (int i = 0; i < this.size.getHeight(); i++) {
            for (int j = 0; j < this.size.getWidth(); j++) {
                this.matrix[i][j] = DEFAULT_EMPTY_CHAR;
            }
        }
    }

    private void activateSegmentA() {
        for (int i = 1; i < this.size.getWidth() - 1; i++) {
            this.matrix[0][i] = DEFAULT_HORIZONTAL_CHAR;
        }
    }

    private void activateSegmentB() {
        for (int i = 1; i < this.size.getHeight() / 2; i++) {
            this.matrix[i][this.size.getWidth() - 1] = DEFAULT_VERTICAL_CHAR;
        }
    }

    private void activateSegmentC() {
        for (int i = this.size.getHeight() / 2 + 1; i < this.size.getHeight() - 1; i++) {
            this.matrix[i][this.size.getWidth() - 1] = DEFAULT_VERTICAL_CHAR;
        }
    }

    private void activateSegmentD() {
        for (int i = 1; i < this.size.getWidth() - 1; i++) {
            this.matrix[this.size.getHeight() - 1][i] = DEFAULT_HORIZONTAL_CHAR;
        }
    }

    private void activateSegmentE() {
        for (int i = this.size.getHeight() / 2 + 1; i < this.size.getHeight() - 1; i++) {
            this.matrix[i][0] = DEFAULT_VERTICAL_CHAR;
        }
    }

    private void activateSegmentF() {
        for (int i = 1; i < this.size.getHeight() / 2; i++) {
            this.matrix[i][0] = DEFAULT_VERTICAL_CHAR;
        }
    }

    private void activateSegmentG() {
        for (int i = 1; i < this.size.getCenter(); i++) {
            this.matrix[this.size.getCenter()][i] = DEFAULT_HORIZONTAL_CHAR;
        }
    }

    /**
     * Metodo que activa los segmentos indicados.
     * 
     * @param segments Array de segmentos que se activaran.
     */
    public void activateSegments(int[] segments) {
        for(int segemnt : segments) {
            switch(segemnt) {
                case SEGEMENT_A:
                    this.activateSegmentA();
                    break;
                case SEGEMENT_B:
                    this.activateSegmentB();
                    break;
                case SEGEMENT_C:
                    this.activateSegmentC();
                    break;
                case SEGEMENT_D:
                    this.activateSegmentD();
                    break;
                case SEGEMENT_E:
                    this.activateSegmentE();
                    break;
                case SEGEMENT_F:
                    this.activateSegmentF();
                    break;
                case SEGEMENT_G:
                    this.activateSegmentG();
                    break;
            }
        }
    }

    public char[][] getMatrix() {
        return this.matrix;
    }

    public DigitSize getSize() {
        return size;
    }
    
}
