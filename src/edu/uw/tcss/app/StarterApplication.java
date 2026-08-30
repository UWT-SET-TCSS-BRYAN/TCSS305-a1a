package edu.uw.tcss.app;

import java.util.logging.Level;
import java.util.logging.Logger;

// TODO add a class Javadoc comment here, including @author and @version tags.
public final class StarterApplication {

    public static final Logger LOGGER = Logger.getLogger(StarterApplication.class.getName());

    static {
        // Level.ALL - Display ALL logging messages
        // Level.OFF - Display NO logging messages
        LOGGER.setLevel(Level.ALL);
    }

    // Java 25 allows main to be declared without public. See JEP 512.
    static void main(final String[] args) {
        // TODO read, review, then delete the following 4 LOGGER method calls.
        LOGGER.info(() -> "Should you need String concatenation,  "
                + "use a lambda for lazy evaluation. What's that you ask?");
        LOGGER.info(() -> "What is a magic number you ask?,  "
                + 1977);
        LOGGER.severe("This is really bad");
        LOGGER.warning("I've got a bad feeling about this");

        // TODO read, review, then delete the following println method call.
        System.out.println("This should not be used unless this is an actual console application!");
    }


    // Contract: isBlue returns true when its argument reads "blue" in any mix of upper
    //  and lower case. It returns false for anything else, including null. It never
    //  throws. (Same contract as Requirement 3 on the assignment page.)
    // TODO make the code below match that contract, then replace this comment with a
    //  proper Javadoc comment.
    public static boolean isBlue(final String input) {
        return input == "blue";
    }

}
