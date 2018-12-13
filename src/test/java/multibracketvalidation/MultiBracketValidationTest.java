package multibracketvalidation;

import org.junit.Test;

import static multibracketvalidation.MultiBracketValidation.bracketValidator;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void bracketValidator_True() {
        assertTrue("Should return TRUE", bracketValidator("[]{}()"));
        assertTrue("Should return TRUE", bracketValidator("{ a [ b ( c ) d ] e }"));
        assertTrue("Should return TRUE", bracketValidator("a b c d"));
    }

    @Test
    public void bracketValidator_False() {
        assertFalse("Should return FALSE", bracketValidator("[({}]"));
        assertFalse("Should return FALSE", bracketValidator("(]("));
        assertFalse("Should return FALSE", bracketValidator("{(})"));
    }

    @Test
    public void bracketValidator_Empty() {
        assertTrue("Should return TRUE", bracketValidator(""));
    }
}