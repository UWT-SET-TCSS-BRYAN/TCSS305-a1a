package edu.uw.tcss.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the StarterApplication class.
 *
 * @author Charles Bryan
 * @version Autumn 2026
 */
class StarterApplicationTest {

    /**
     * The expected value in upper case.
     */
    private static final String BLUE_UPPER = "BLUE";

    /**
     * The expected value in lower case.
     */
    private static final String BLUE_LOWER = "blue";

    /**
     * The expected value in mixed case.
     */
    private static final String BLUE_MIXED = "Blue";

    /**
     * A value that is not the expected value.
     */
    private static final String NOT_BLUE = "red";

    // ============ isBlue Tests ============

    /**
     * Test isBlue returns true for an all upper case input.
     */
    @Test
    void testIsBlueUpperCase() {
        assertTrue(StarterApplication.isBlue(BLUE_UPPER),
                "isBlue should return true for an all upper case input");
    }

    /**
     * Test isBlue returns true for an all lower case input.
     */
    @Test
    void testIsBlueLowerCase() {
        assertTrue(StarterApplication.isBlue(BLUE_LOWER),
                "isBlue should return true for an all lower case input");
    }

    /**
     * Test isBlue returns true for a mixed case input.
     */
    @Test
    void testIsBlueMixedCase() {
        assertTrue(StarterApplication.isBlue(BLUE_MIXED),
                "isBlue should return true for a mixed case input");
    }

    /**
     * Test isBlue returns true for a String built at run time rather than a literal.
     * A correct implementation compares character content, so it must not depend on
     * the argument being the same object as a compile time String literal.
     */
    @Test
    void testIsBlueNonLiteralString() {
        final String computed = BLUE_UPPER.toLowerCase(Locale.ROOT);
        assertTrue(StarterApplication.isBlue(computed),
                "isBlue should compare String content, not String identity");
    }

    /**
     * Test isBlue returns false for a value that is not the expected value.
     */
    @Test
    void testIsBlueOtherValue() {
        assertFalse(StarterApplication.isBlue(NOT_BLUE),
                "isBlue should return false for an unrelated value");
    }

    /**
     * Test isBlue returns false for a null input rather than throwing.
     */
    @Test
    void testIsBlueNull() {
        assertFalse(StarterApplication.isBlue(null),
                "isBlue should return false for null rather than throwing");
    }
}
