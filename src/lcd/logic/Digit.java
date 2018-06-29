package lcd.logic;

/**
 *
 * @author Camila Buitrago
 */

public class Digit {

    private static int[] ZERO = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_C, SevenSegmentMatrix.SEGEMENT_D,
        SevenSegmentMatrix.SEGEMENT_E, SevenSegmentMatrix.SEGEMENT_F
    };
    private static int[] ONE = new int[]{
        SevenSegmentMatrix.SEGEMENT_B, SevenSegmentMatrix.SEGEMENT_C
    };
    private static int[] TWO = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_G, SevenSegmentMatrix.SEGEMENT_E,
        SevenSegmentMatrix.SEGEMENT_D
    };
    private static int[] THREE = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_C, SevenSegmentMatrix.SEGEMENT_D,
        SevenSegmentMatrix.SEGEMENT_G
    };
    private static int[] FOUR = new int[]{
        SevenSegmentMatrix.SEGEMENT_B, SevenSegmentMatrix.SEGEMENT_C,
        SevenSegmentMatrix.SEGEMENT_F, SevenSegmentMatrix.SEGEMENT_G
    };
    private static int[] FIVE = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_C,
        SevenSegmentMatrix.SEGEMENT_D, SevenSegmentMatrix.SEGEMENT_F,
        SevenSegmentMatrix.SEGEMENT_G
    };
    private static int[] SIX = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_C,
        SevenSegmentMatrix.SEGEMENT_D, SevenSegmentMatrix.SEGEMENT_E,
        SevenSegmentMatrix.SEGEMENT_F, SevenSegmentMatrix.SEGEMENT_G
    };
    private static int[] SEVEN = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_C
    };
    private static int[] EIGHT = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_C, SevenSegmentMatrix.SEGEMENT_D,
        SevenSegmentMatrix.SEGEMENT_E, SevenSegmentMatrix.SEGEMENT_F,
        SevenSegmentMatrix.SEGEMENT_G
    };
    private static int[] NINE = new int[]{
        SevenSegmentMatrix.SEGEMENT_A, SevenSegmentMatrix.SEGEMENT_B,
        SevenSegmentMatrix.SEGEMENT_C, SevenSegmentMatrix.SEGEMENT_D,
        SevenSegmentMatrix.SEGEMENT_F, SevenSegmentMatrix.SEGEMENT_G
    };

    private SevenSegmentMatrix sevenSegmentMatrix;
    private int digit;
    private int size;

    public Digit(int digit, int size) {
        this.digit = digit;
        this.size = size;
        this.initSeventSegmentMatrix();
    }

    private void initSeventSegmentMatrix() {
        this.sevenSegmentMatrix = new SevenSegmentMatrix(this.size);
        switch (this.digit) {
            case 0:
                this.sevenSegmentMatrix.activateSegments(ZERO);
                break;
            case 1:
                this.sevenSegmentMatrix.activateSegments(ONE);
                break;
            case 2:
                this.sevenSegmentMatrix.activateSegments(TWO);
                break;
            case 3:
                this.sevenSegmentMatrix.activateSegments(THREE);
                break;
            case 4:
                this.sevenSegmentMatrix.activateSegments(FOUR);
                break;
            case 5:
                this.sevenSegmentMatrix.activateSegments(FIVE);
                break;
            case 6:
                this.sevenSegmentMatrix.activateSegments(SIX);
                break;
            case 7:
                this.sevenSegmentMatrix.activateSegments(SEVEN);
                break;
            case 8:
                this.sevenSegmentMatrix.activateSegments(EIGHT);
                break;
            case 9:
                this.sevenSegmentMatrix.activateSegments(NINE);
                break;
        }
    }

    public char[][] getMatrix() {
        return this.sevenSegmentMatrix.getMatrix();
    }

}
