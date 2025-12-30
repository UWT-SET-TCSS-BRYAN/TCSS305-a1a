package edu.uw.tcss.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the StoreItem class.
 *
 * @author Charles Bryan
 * @version Winter 2026
 */
class StoreItemTest {

    /**
     * The name of the test item.
     */
    private static final String ITEM_NAME = "Computer Science Pen";

    /**
     * The price of the test item as a String for BigDecimal construction.
     */
    private static final String ITEM_PRICE = "2.00";

    /**
     * The quantity used in calculateTotal tests.
     */
    private static final int TEST_QUANTITY = 3;

    /**
     * The expected total for TEST_QUANTITY items at ITEM_PRICE.
     */
    private static final String SIX_DOLLARS = "6.00";

    // ============ Constructor Tests ============

    /**
     * Test constructor with valid arguments.
     */
    @Test
    void testConstructorValid() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertEquals(ITEM_NAME, item.getName(), "Name should match constructor argument");
        assertEquals(new BigDecimal(ITEM_PRICE), item.getPrice(),
                "Price should match constructor argument");
    }

    /**
     * Test constructor with null name throws NullPointerException.
     */
    @Test
    void testConstructorNullName() {
        assertThrows(NullPointerException.class,
                () -> new StoreItem(null, new BigDecimal(ITEM_PRICE)),
                "Constructor should throw NullPointerException for null name");
    }

    /**
     * Test constructor with null price throws NullPointerException.
     */
    @Test
    void testConstructorNullPrice() {
        assertThrows(NullPointerException.class,
                () -> new StoreItem(ITEM_NAME, null),
                "Constructor should throw NullPointerException for null price");
    }

    /**
     * Test constructor with empty name throws IllegalArgumentException.
     */
    @Test
    void testConstructorEmptyName() {
        assertThrows(IllegalArgumentException.class,
                () -> new StoreItem("", new BigDecimal(ITEM_PRICE)),
                "Constructor should throw IllegalArgumentException for empty name");
    }

    /**
     * Test constructor with negative price throws IllegalArgumentException.
     */
    @Test
    void testConstructorNegativePrice() {
        assertThrows(IllegalArgumentException.class,
                () -> new StoreItem(ITEM_NAME, new BigDecimal("-0.01")),
                "Constructor should throw IllegalArgumentException for negative price");
    }

    // ============ Getter Tests ============

    /**
     * Test getName returns the correct item name.
     */
    @Test
    void testGetName() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertEquals(ITEM_NAME, item.getName(), "getName should return the item name");
    }

    /**
     * Test getPrice returns the correct item price.
     */
    @Test
    void testGetPrice() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertEquals(new BigDecimal(ITEM_PRICE), item.getPrice(),
                "getPrice should return the item price");
    }

    // ============ calculateTotal Tests ============

    /**
     * Test calculateTotal with a valid quantity.
     */
    @Test
    void testCalculateTotalBasic() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        final BigDecimal expected = new BigDecimal(SIX_DOLLARS);
        assertEquals(expected, item.calculateTotal(TEST_QUANTITY),
                "calculateTotal should return price * quantity");
    }

    /**
     * Test calculateTotal with zero quantity returns zero.
     */
    @Test
    void testCalculateTotalZeroQuantity() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertEquals(new BigDecimal("0.00"), item.calculateTotal(0),
                "calculateTotal with zero quantity should return zero");
    }

    /**
     * Test calculateTotal with negative quantity throws IllegalArgumentException.
     */
    @Test
    void testCalculateTotalNegativeQuantity() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertThrows(IllegalArgumentException.class,
                () -> item.calculateTotal(-1),
                "calculateTotal should throw IllegalArgumentException for negative quantity");
    }

    // ============ getFormattedDescription Tests ============

    /**
     * Test getFormattedDescription returns correctly formatted string.
     */
    @Test
    void testGetFormattedDescription() {
        final StoreItem item = new StoreItem(ITEM_NAME, new BigDecimal(ITEM_PRICE));
        assertEquals("Computer Science Pen, $2.00", item.getFormattedDescription(),
                "getFormattedDescription should return 'name, $price' format");
    }
}