package edu.uw.tcss.WRONG;  // Wrong: uppercase in package name

import java.awt.event.ActionEvent;
import java.util.*;  // Wrong: star import
import java.util.List;  // Wrong: redundant import


// Wrong: missing class Javadoc, missing @author/@version
public class checkstyleRuleBreaker extends Exception {  // Wrong: mutable exception, should be final

    // Wrong: inner class should be last
    class innerClass { }  // Wrong: type name not CapitalizedWords

    public String publicField = "exposed";  // Wrong: public field
    private String badName;  // Wrong: should start with "my"
    private static final int magic = 42;  // Wrong: constant not UPPER_CASE

    // Wrong: missing Javadoc
    public checkstyleRuleBreaker(String badName, int x, int y, int z, int a, int b, int c, int d, int e) {  // Wrong: 9 params > 8
        this.badName = badName;  // Wrong: hidden field, param not final
    }

    // Wrong: missing Javadoc, missing @Override
    public boolean equals(checkstyleRuleBreaker other) {  // Wrong: covariant equals
        return badName.equals(other.badName);  // Wrong: should be "literal".equals(var)
    }

    // Wrong: no hashCode with equals

    public String getValue() {
        String myLocal = "test";  // Wrong: local starts with "my"
        return myLocal;
    }

    public void tooManyReturns(int x) {  // Wrong: missing final param
        if (x < 0) return;
        if (x > 100) return;
        if (x == 50) return;
        return;  // Wrong: 4 returns > 3
    }

    public void badWhitespace( int x,int y ) {  // Wrong: space inside parens, no space after comma
        int z=x+y;  // Wrong: no spaces around operators
    }

    public void deepNesting(int x) {
        if (x > 0) {
            if (x > 10) {
                if (x > 100) {  // Wrong: nested if depth > 2
                    System.out.println("deep");
                }
            }
        }
    }

    public void multiStatement() {
        int a = 1; int b = 2;  // Wrong: multiple statements per line
        int c = 3, d = 4;  // Wrong: multiple variable declarations
    }

    public void badSwitch(int x) {
        switch (x) {
            case 1:
                System.out.println("one");  // Wrong: fallthrough without comment
            case 2:
                System.out.println("two");
                break;
            // Wrong: missing default case
        }
    }

    public void stringComparison() {
        String s = "test";
        if (s == "test") { }  // Wrong: string literal equality with ==
    }

    public void inlineConditional(int x) {
        // This is now ALLOWED (we removed AvoidInlineConditionals)
        int y = x > 0 ? 1 : -1;
    }

    public void duplicateStrings() {
        System.out.println("duplicate");  // Wrong: duplicate string literal
        System.out.println("duplicate");
        System.out.println("duplicate");
    }

    public void badLambda() {
        List<String> list = new ArrayList<>();
        list.forEach(s -> {
            System.out.println(s);  // Wrong: 2 statements in lambda
            System.out.println(s.length());
        });
    }

    public void chainedMethods() {
        new StringBuilder()
            .append("wrong")// Wrong: dot should be at start of new line, not end
            .append("format");
    }

    public void longLine() {
        String reallyLongVariableName = "This is a very very very very very very very very very very very very long string that exceeds 120 characters";  // Wrong: > 120 chars
    }

    public void magicNumbers() {
        int result = 42 * 7 + 13;  // Wrong: magic numbers
    }

    public void catchException() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {  // Wrong: illegal catch of Exception
            // Wrong: empty block
        }
    }

    public void throwsException() throws Exception { }  // Wrong: illegal throws

    public void explicitInit() {
        int x = 0;  // Wrong: explicit initialization to default
        String s = null;  // Wrong: explicit initialization to default
    }

    public void unnecessaryParens() {
        int x = (1 + 2);  // Wrong: unnecessary parentheses
    }

    public void modifyLoopVar() {
        for (int i = 0; i < 10; i++) {
            i = i + 2;  // Wrong: modified control variable
        }
    }

    String args[];  // Wrong: array style should be String[]

    long bigNumber = 1000000000l;  // Wrong: use L not l for long

}
