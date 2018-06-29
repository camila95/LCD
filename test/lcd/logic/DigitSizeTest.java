package lcd.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Buitrago
 */

public class DigitSizeTest {

    private DigitSize dummyDigitSize;

    @Before
    public void setUp() {
        this.dummyDigitSize = new DigitSize(2);
    }

    @After
    public void tearDown() {
        this.dummyDigitSize = null;
    }

    /**
     * Test of getSize method, of class DigitSize.
     */
    @Test
    public void testGetSize() {
        int expResult = 2;
        int result = this.dummyDigitSize.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeight method, of class DigitSize.
     */
    @Test
    public void testGetHeight() {
        int expResult = 7;
        int result = this.dummyDigitSize.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWidth method, of class DigitSize.
     */
    @Test
    public void testGetWidth() {
        int expResult = 4;
        int result = this.dummyDigitSize.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCenter method, of class DigitSize.
     */
    @Test
    public void testGetCenter() {
        int expResult = 3;
        int result = this.dummyDigitSize.getCenter();
        assertEquals(expResult, result);
    }

}
