public class Animal {
    public String name;
    public int age;
    public String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public String info() {
        return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n";
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
        Cat cat = new Cat("Kitty", 3, "White", "Persian");
        System.out.println("1.========");
        System.out.println(dog.info());
        System.out.println("2.========");
        System.out.println(cat.info());
        System.out.println("3.========");
        dog.makeSound();
        System.out.println("4.========");
        cat.makeSound();
    }

}
