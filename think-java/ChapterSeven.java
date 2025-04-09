public class ChapterSeven {
    public static void printTable() {
        final double LOG2 = Math.log(2);
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "    " + Math.log(x) / LOG2);
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}
