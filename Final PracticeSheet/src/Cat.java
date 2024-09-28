public class Cat extends Animal {
    public String breed;
    public Cat(String x, int y, String z, String a){
        super(x,y,z);
        this.breed = a;
    }
    public void makeSound(){
        System.out.println(color+" color "+name+" is meowing");
    }
}
