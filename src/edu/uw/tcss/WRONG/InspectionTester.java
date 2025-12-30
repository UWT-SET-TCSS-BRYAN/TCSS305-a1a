package edu.uw.tcss.WRONG;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class intentionally triggers IntelliJ inspections (not Checkstyle).
 * Students should delete this entire package.
 *
 * @author Charles Bryan
 * @version 1.0
 */
public final class InspectionTester implements Comparable<InspectionTester> {

    /** A field for testing. */
    private final String myName;

    /** Another field. */
    private final int myValue;

    /**
     * Constructor.
     * @param theName the name
     * @param theValue the value
     */
    public InspectionTester(final String theName, final int theValue) {
        myName = theName;
        myValue = theValue;
    }

    // ===== Unused parameter (checkParameterExcludingHierarchy test) =====

    /**
     * Handler that doesn't use its parameter.
     * Should NOT warn because it matches ActionListener signature.
     * @param theEvent the event (unused intentionally)
     */
    private void handleClick(final ActionEvent theEvent) {
        System.out.println("Clicked!");  // SystemOutErr warning
    }

    // ===== Custom functional interface test =====

    /**
     * Custom functional interface for testing.
     * @param <T> the input type
     */
    @FunctionalInterface
    interface CustomProcessor<T> {
        /**
         * Process the input.
         * @param theInput the input to process
         */
        void process(T theInput);
    }

    private void processData(final String theData) {
        System.out.println("Processing...");  // Ignores theData
    }

    private void readName(final String theData) {
        System.out.println("Processing...");  // Ignores theData
    }

    /**
     * Uses the custom processor via method reference.
     */
    public void useCustomProcessor() {
        final CustomProcessor<String> processor = this::processData;
        processor.process("test");
    }

    // ===== ComparableImplementedButEqualsNotOverridden =====
    // We implement Comparable but don't override equals - should warn

    @Override
    public int compareTo(final InspectionTester theOther) {
        return myName.compareTo(theOther.myName);
    }

    // ===== Missing @Override annotation =====

    /**
     * Returns string representation.
     * @return the string
     */
    public String toString() {  // Missing @Override - should warn
        return myName;
    }

    // ===== AssignmentToMethodParameter =====

    /**
     * Method that reassigns a parameter.
     * @param theInput input value
     * @return modified value
     */
    public int reassignParam(int theInput) {  // not final - Checkstyle warns
        theInput = theInput + 1;  // IntelliJ: AssignmentToMethodParameter
        return theInput;
    }

    // ===== MultipleReturnPointsPerMethod (limit is 3, this has 4) =====

    /**
     * Method with too many return points.
     * @param theValue input
     * @return result
     */
    public String tooManyReturns(final int theValue) {
        if (theValue < 0) {
            return "negative";
        }
        if (theValue == 0) {
            return "zero";
        }
        if (theValue < 10) {
            return "small";
        }
        return "large";  // 4th return - should warn (limit is 3)
    }

    // ===== NegativelyNamedBooleanVariable =====

    /**
     * Uses negatively named boolean.
     * @return result
     */
    public boolean checkNegativeNaming() {
        final boolean isNotReady = true;  // Negatively named - should warn
        return isNotReady;
    }

    // ===== UtilityClass issues - inner class example =====

    /**
     * Utility class without private constructor.
     */
    static class BadUtility {  // Should warn: no private constructor
        /**
         * Utility method.
         * @param theInput input
         * @return output
         */
        public static String process(final String theInput) {
            return theInput.toUpperCase();
        }
    }

    // ===== Anonymous class with too many methods =====

    /**
     * Creates listener with complex anonymous class.
     * @return the listener
     */
    public ActionListener createComplexListener() {
        return new ActionListener() {  // AnonymousClassMethodCount > 1
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                helper();
            }

            private void helper() {
                System.out.println("helper");
            }
        };
    }

    // ===== OverridableMethodCallDuringObjectConstruction =====
    // (Can't easily demo without another class)

    // ===== LiteralAsArgToStringEquals (wrong order) =====

    /**
     * Uses equals in wrong order.
     * @param theInput input
     * @return result
     */
    public boolean badEqualsOrder(final String theInput) {
        return theInput.equals("test");  // Should be "test".equals(theInput)
    }

    // ===== Unused local variable =====

    /**
     * Has unused variable.
     */
    public void unusedVariable() {
        final String unused = "never used";  // Should warn
        System.out.println("done");
    }

    // ===== Simplifiable if statement =====

    /**
     * Could be simplified.
     * @param theFlag input
     * @return result
     */
    public boolean simplifiable(final boolean theFlag) {
        if (theFlag) {  // SimplifiableIfStatement: return theFlag;
            return true;
        } else {
            return false;
        }
    }


}