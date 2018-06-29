package lcd.logic;

/**
 *
 * @author Camila Buitrago
 */

public class DigitSize {

    private int size;
    private int height;
    private int width;
    private int center;

    public DigitSize(int size) {
        // se valida que el size este entre 1 y 10
        if (size < 1 || size > 10) {
            throw new IllegalArgumentException("El parametro size [" + size
                    + "] debe estar entre 1 y 10");
        }
        this.size = size;
        this.height = (size * 2) + 3;
        this.width = size + 2;
        this.center = ((size * 2) + 3) / 2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }
    
}
