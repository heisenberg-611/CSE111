public class Vehicle{
    public String brand;
    public String number;
    public int speed;

    public Vehicle(String b, String n){
        brand = b;
        number = n;
    }

    public void details(){
        System.out.println("Brand: "+brand);
        System.out.print("Number: ");
        for(int i = 0; i<=number.length()-4;i++){
            System.out.print(number.charAt(i));
        }
        System.out.print(" ");
        for(int i = 4; i<number.length();i++){
            System.out.print(number.charAt(i));
        }
        System.out.println();
        System.out.println("Speed: "+speed+"km/h");
    }
    public static void main(String args[]){
        Car c1 = new Car("Ford", "CD34UVW");
        c1.details();
        System.out.println("1-------------");
        Car c2 = new Car("BMW", "RS78JKL");
        c2.details();
        System.out.println("2-------------");
        c1.increaseSpeed(60);
        System.out.println("3--------------");
        c1.details();
    }

}
