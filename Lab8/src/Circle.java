public class Circle extends Shape {
    public int radius;

    public void area(){
        double area = 3.1416 * radius * radius;
        System.out.println("Area of "+ color +" Circle: " + Math.floor(area*100)/100);
    }
}

