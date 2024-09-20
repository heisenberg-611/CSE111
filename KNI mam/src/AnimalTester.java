public class AnimalTester{
    public static void main(String args[]){
        Animal a1 = new Animal();
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        Dog d1  = new Dog();
        System.out.println("3-------------");
        d1.details();
        System.out.println("4-------------");
        d1.updateSound("Bark");
        d1.details();
    }
}
