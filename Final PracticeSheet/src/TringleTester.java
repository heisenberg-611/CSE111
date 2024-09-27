public class TringleTester {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Triangle t1 = new Triangle(5,6,7);
        System.out.println("Area of Triangle "+t.area());
        System.out.println("Perimeter of Triangle "+t.perimeter());
        System.out.println("Area of Triangle "+t1.area());
        System.out.println("Perimeter of Triangle "+t1.perimeter());

        t.setLength(12);

        System.out.println("Area of Triangle "+t.area());
        System.out.println("Area of Triangle "+t.area()+" and its width is "+t.getwidth());
    }
}
