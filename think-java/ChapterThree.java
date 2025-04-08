import java.util.Scanner;

public class ChapterThree {
    public static void main(String[] args) {
        // The System class
        System.out.println(System.out);
        // The output indicates that System.out is a
        // PrintStream, defined in java.io

        // The Scanner class
        // String line;

        // Before using Scanner, it must be imported,
        // see line 1 import java.util.Scanner;

        // try (// This uses System.in, an InputStream with
        //         // methods for reading input from the keyboard
        // Scanner in = new Scanner(System.in)) {
        //     System.out.print("Type something: ");
        //     line = in.nextLine();
        //     System.out.println("You said: " + line);

        //     System.out.print("Type something else: ");
        //     line = in.nextLine();
        //     System.out.println("You also said: " + line);
        // }

        // Inches to centimeters
        int inch;
        double cm;
        try (
        Scanner in = new Scanner(System.in)) {
            System.out.print("How many inches? ");
            inch = in.nextInt();
            // Literal (not preferable)
            // cm = inch * 2.54;
            final double CM_PER_INCH = 2.54;
            cm = inch * CM_PER_INCH;

            // Without formatting strings
            // System.out.print(inch + " in = ");
            // System.out.println(cm + " cm");

            // Formatted string where %d shows integer
            // values (decimal) and %f shows float
            // (floating-point)
            System.out.printf("%d in = %f cm\n", inch, cm);
        }

        // Formatting output
        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
        // %.3f indicates that the value should be
        // displayed as a floating-point rounded to
        // three decimal places

        // List of more
        // %d   - decimal integer
        // %08d - padded with zeros, at least 8 digits wide
        // %f   - floating-point
        // %.2f - rounded to 2 decimal places
    }
}
