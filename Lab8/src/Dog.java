public class Dog extends Animal{
    public String name;

    public Dog(){
        System.out.println("The dog says hello!");
    }

    public void updateSound(String sound){
        this.sound = sound;
    }

    public String getName(){
        return this.name;
    }
}