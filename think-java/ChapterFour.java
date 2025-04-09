public class ChapterFour {
    // New methods
    public static void newLine() {
        System.out.println();
    }

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        // MATH METHODS
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);

        System.out.println(root + " " + angle + " " + height);

        double degrees = 90;
        double angleTwo = degrees / 180.0 * Math.PI;

        System.out.println(angleTwo);

        System.out.println();

        // COMPOSITION REVISITED
        double x = Math.cos(angle + Math.PI / 2.0);
        System.out.println(x);

        double y = Math.exp(Math.log(10.0));
        System.out.println(y);

        double z = Math.pow(2.0, 10.0);
        System.out.println(z);

        System.out.println("First line.");
        newLine();
        System.out.println("Second line.");

        // Class names begin with a capital letter.
        // Methods use camel case: class ChapterFour and
        // newLine() are examples

        // newLine and main are *public*, they can be
        // invoked from other classes. Both are static,
        // and both are void, they don't yield a result

        // main has one parameter, args, with the type
        // String[], whoever invokes main must give an
        // array of strings

        // Since newLine is in the same class as main,
        // we don't have to specify the class

        // FLOW OF EXECUTION

        // Top to bottom is not the flow of execution
        // of the java program, execution always begins
        // at main, statements - one at a time in order

        // PARAMETERS/ARGUMENTS
        printTwice("This gets printed twice!");

        String argument = "And again...";
        printTwice(argument);
    }
}
