public class ChapterTwo {
    public static void main(String[] args) {
        // Variables must be declared in Java
        String message = "The current time is ";
        int hour = 11;
        int minute = 59;

        System.out.println(message + hour + ":" + minute + ".");

        // Reassigning variables
        int a = 5;
        int b = a;
        a = 3;
        System.out.println(a);
        System.out.println(b);

        double pi;
        pi = 3.14159;

        System.out.println(pi);

        // Rounding errors
        // This prints normally
        System.out.println(0.1 * 10);
        // This has a rounding error due to the fact that
        // it's a repeating fraction in binary, so its
        // floating-point representation is only
        // approximate
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        
        double balance = 123.45;
        System.out.println(balance);

        int value = 59;
        int percentage = (value * 100) / 60;
        System.out.println(percentage);
    }
}
