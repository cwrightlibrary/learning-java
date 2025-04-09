public class ChapterSix {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void returnValues() {
        // See lines 2-5
        double radius = 6.4;
        double area = calculateArea(radius);
        System.out.println(area);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double bothX = x2 - x1;
        double bothY = y2 - y1;
        double sqX = bothX * bothX;
        double sqY = bothY * bothY;
        double retDist = sqX + sqY;
        // System.out.println(retDist);
        return retDist;
    }

    public static double circleArea(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }
    public static void main(String[] args) {
        // returnValues();
        // System.out.println(distance(4, 3, 6, 9));
        System.out.println(circleArea(5, 2, 8, 3));
    }
}
