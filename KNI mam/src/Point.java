public class Point {
    public int x, y;
    public double area;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.area = 0;
    }

    public double calculateArea() {
        return this.area;
    }

    public void printDetails() {
        System.out.println("Printing details: ");
        System.out.println("Co-ordinate: (" + this.x + "," + this.y + ")");
        System.out.println("Area: " + this.area);
    }
    public static void main(String[] args) {
        System.out.println("---------1----------");
        Point p1 = new Point(2, 3);
        System.out.println("Area of p1: " + p1.calculateArea());
        System.out.println("---------2----------");
        p1.printDetails();
        System.out.println("---------3----------");
        Point p2 = new Point(4, 6);
        p2.printDetails();
        System.out.println("---------4----------");
        Circle c1 = new Circle(4, 0, 3);
        System.out.println("Area of c1: " + c1.calculateArea());
        System.out.println("---------5----------");
        c1.printDetails();
    }
}
