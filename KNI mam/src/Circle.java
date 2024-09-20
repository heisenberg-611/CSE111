class Circle extends Point {
    public double radius;

    // Constructor to initialize x, y, and radius
    public Circle(double radius, int x, int y) {
        super(x, y); // Call the constructor of the parent class Point
        this.radius = radius;
        this.area = calculateArea(); // Calculate and store the area for the circle
    }

    // Override the calculateArea method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of the circle = π * r^2
    }

    // Override the printDetails method to include radius information
    public void printDetails() {
        System.out.println("Printing details: ");
        System.out.println("Co-ordinate: (" + this.x + "," + this.y + ")");
        System.out.println("Area: " + this.area);
        System.out.println("Radius: " + this.radius);
    }
}
