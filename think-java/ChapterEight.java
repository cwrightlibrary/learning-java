import java.util.Arrays;

public class ChapterEight {
    /**
     * Prints the values of an array on a single line
     * @param a the array to print
     */
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        printArray(a);
        System.out.println(Arrays.toString(a));
    }
}
