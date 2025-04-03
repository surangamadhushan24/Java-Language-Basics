package passByValueExperiment;

public class SwapExperiment {

    public static void swapIntegers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swapIntegers: a = " + a + ", b = " + b);
    }

    public static void swapPoints(Point p1, Point p2) {
        Point temp = p1;
        p1 = p2;
        p2 = temp;
        System.out.println("Inside swapPoints: p1 = " + p1 + ", p2 = " + p2);
    }

    public static void modifyPoint(Point p) {
        p.x = 100;
        p.y = 200;
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        System.out.println("Before swapIntegers: num1 = " + num1 + ", num2 = " + num2);
        swapIntegers(num1, num2);
        System.out.println("After swapIntegers: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("---");


        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        System.out.println("Before swapPoints: point1 = " + point1 + ", point2 = " + point2);
        swapPoints(point1, point2);
        System.out.println("After swapPoints: point1 = " + point1 + ", point2 = " + point2);

        System.out.println("---");

        System.out.println("Before modifyPoint: point1 = " + point1);
        modifyPoint(point1);
        System.out.println("After modifyPoint: point1 = " + point1);
    }
}


