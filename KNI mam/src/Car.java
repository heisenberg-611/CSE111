public class Car extends Vehicle {
    public Car(String b, String n){
        super(b, n);
    }
    public void increaseSpeed(int n){
        this.speed += n;
        System.out.println("Speed is increased");
    }
}
