public class Shape {
    public String Name;
    public double Area;
    public void setParameters(String name, int r){
        Name = name;
        Area = 3.1416*r*r;
    }

    public void setParameters(String name, int b, int h){
        Name = name;
        Area = (b*h)/2;
    }

    public void setParameters(String name, int a, int b, int h){
        Name = name;
        Area = ((a+b)*h/2);
    }

    public double details(){
        System.out.println("Shape Name: " + Name);
        System.out.print("Area: ");
        return Area;
    }

    public static void main(String[] args){
        Shape circle = new Shape();
        Shape triangle = new Shape();
        Shape trapezium = new Shape();

        circle.setParameters("Circle", 5);
        triangle.setParameters("Triangle", 4, 7);
        trapezium.setParameters("Trapezium", 2, 4, 9);

        System.out.println(circle.details());
        System.out.println("---------------");
        System.out.println(triangle.details());
        System.out.println("---------------");
        System.out.println(trapezium.details());
    }
}