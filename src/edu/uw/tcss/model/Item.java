package edu.uw.tcss.model;

import java.math.BigDecimal;

/**
 * Represents a single item for sale in the bookstore.
 * <p>
 * This interface defines the contract for all items, requiring them to know
 * how to calculate their own total price (Information Expert pattern).
 * Items handle their own pricing logic, removing the need for external code
 * to know about bulk pricing or other pricing strategies.
 * <p>
 *
 * @author Charles Bryan
 * @version Winter 2025
 */
public interface Item {

    /**
     * Returns the name for this Item.
     *
     * @return the name for this Item
     */
    String getName();

    /**
     * Returns the unit price for this Item.
     * This is the price for a single unit, used for display.
     *
     * @return the unit price for this Item
     */
    BigDecimal getPrice();

    /**
     * Calculates the total price for the given quantity of this item.
     *
     * @param quantity the quantity to calculate the total for
     * @return the total price for the given quantity
     * @throws IllegalArgumentException if quantity is negative
     */
    BigDecimal calculateTotal(int quantity);

    /**
     * Returns a formatted description of this item suitable for display in a GUI.
     * <p>
     * This method provides a human-readable representation of the item including
     * its name, price, and (for bulk items) bulk pricing information. This is
     * distinct from toString() which is intended for debugging purposes.
     * <p>
     * Format examples:
     * - Simple item: "Computer Science Pen, $2.00"
     * - Bulk item: "'Java Rules!' button, $0.95 (10 for $5.00)"
     *
     * @return a formatted string suitable for display to end users
     */
    String getFormattedDescription();
}
