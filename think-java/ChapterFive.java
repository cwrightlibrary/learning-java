public class ChapterFive {
    public static void printLogarithm(double z) {
        if (z <= 0.0) {
            System.err.println("Error: z (" + z + ") must be positive.");
            return;
        }
        double result = Math.log(z);
        System.out.println("The log of z (" + z + ") is " + result);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
    public static void main(String[] args) {
        // RELATIONAL OPERATORS
        // Java uses the same syntax for relational
        // operators (==, !=, >, >=, <, <=)
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        System.out.println(fruit1.equals(fruit2));

        // LOGICAL OPERATORS
        // && is AND, || is or, ! is not

        // CONDITIONAL STATEMENTS
        int x = 3;
        if (x > 0) {
            System.out.println("x (" + x + ") is positive");
        } else {
            System.out.println("x (" + x + ") is negative");
        }

        // CHAINING AND NESTING
        int y  = -4;
        if (y > 0) {
            System.out.println("y is positive");
        } else if (y < 0) {
            System.out.println("y is negative");
        } else {
            System.out.println("y is 0");
        }

        if (y == 0) {
            System.out.println("y is zero");
        } else {
            if (y > 0) {
                System.out.println("y is positive");
            } else {
                System.out.println("y is negative");
            }
        }

        // FLAG VARIABLES
        boolean flag;
        flag = true;
        boolean testResult = false;
        System.out.println(flag + " " + testResult);

        boolean evenFlag = (y % 2 == 0);
        boolean positiveFlag = (y > 0);
        System.out.println(evenFlag + " " + positiveFlag);

        if (evenFlag) {
            System.out.println("y was even when I checked it!");
        } else if (!evenFlag) {
            System.out.println("y was odd when I checked it!");
        }

        // RETURN STATEMENT
        // The return statement lets us terminate a
        // method before we reach the end (see lines
        // 2-9)
        double z = -2.4;
        printLogarithm((z));

        // RECURSIVE METHODS
        // (see lines 11-18)
        int n = 3;
        countdown(n);
    }
}
