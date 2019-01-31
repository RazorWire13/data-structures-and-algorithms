import org.junit.Test;

import static org.junit.Assert.*;

public class DecToRomansTest {

    @Test
    public void makeRoman_TestSingle() {
        String expected = "IV";
        assertEquals("Expected should equal actual", expected, DecToRomans.makeRoman(4));
    }

    @Test
    public void makeRoman_TestTens() {
        String expected = "XIX";
        assertEquals("Expected should equal actual", expected, DecToRomans.makeRoman(19));
    }

    @Test
    public void makeRoman_TestHundreds() {
        String expected = "CCCLXXXVII";
        assertEquals("Expected should equal actual", expected, DecToRomans.makeRoman(387));
    }

    @Test
    public void makeRoman_TestZero() {
        String expected = "";
        assertEquals("Expected should equal actual", expected, DecToRomans.makeRoman(0000));
    }

    @Test
    public void makeRoman_TestNegatives() {
        String expected = "";
        assertEquals("Expected should equal actual", expected, DecToRomans.makeRoman(-387));
    }
}