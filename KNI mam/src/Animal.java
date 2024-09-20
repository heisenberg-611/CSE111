public class Animal {
    public int legs = 4;
    public String sound = "Not defined";

    public Animal() {
        System.out.println("I am an animal");
    }

    public void details() {
        System.out.println("Legs: " + legs);
        System.out.println("Sound: " + sound);

    }
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
