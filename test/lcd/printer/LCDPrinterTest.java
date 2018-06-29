package lcd.printer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Buitrago
 */

public class LCDPrinterTest {
    
    /**
     * Test of isNumeric method, of class LCDPrinter.
     */
    @Test
    public void testIsNumeric() {
        assertEquals(LCDPrinter.isNumeric("0"), true);
        assertEquals(LCDPrinter.isNumeric("5"), true);
        assertEquals(LCDPrinter.isNumeric("10"), true);
        assertEquals(LCDPrinter.isNumeric("abc"), false);
        assertEquals(LCDPrinter.isNumeric("123abc"), false);
    }
    
}
