package edu.uw.tcss.app;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A driver class for this application.
 *
 * @author Charles Bryan
 * @version Autumn 2025
 */
public final class StarterApplication {

    /**
     * A Logger object for all your logging needs.
     * You should move away from using System.out.println as your logging/debugging method.
     */
    public static final Logger LOGGER = Logger.getLogger(StarterApplication.class.getName());

    static {
        // Level.ALL - Display ALL logging messages
        // Level.OFF - Display NO logging messages
        LOGGER.setLevel(Level.ALL);
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private StarterApplication() {
        super();
        // Utility class - prevent instantiation
    }

    /**
     * The entry point into this application.
     *
     * @param theArgs the command-line arguments for this program.
     */
    static void main(final String[] theArgs) {
        // TODO read, review, then delete the following 4 LOGGER method calls.
        LOGGER.info(() -> "Should you need String concatenation,  "
                + "use a lambda for lazy evaluation. What's that you ask?");
        LOGGER.info(() -> "What is a magic number you ask?,  "
                + 1977);
        LOGGER.severe("This is really bad");
        LOGGER.warning("I've got a bad feeling about this");

        // TODO read, review, then delete the following println metyhod call.
        System.out.println("This should not be used unless this is an actual console application!");
    }



    /**
     * Determines if the input string is "BLUE" (case-insensitive).
     *
     * @param theInput the string to check
     * @return true if the input is "BLUE", false otherwise
     */
    public static boolean isBlue(final String theInput) {
        return "BLUE".equalsIgnoreCase(theInput);
    }

}
