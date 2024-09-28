public class Dog {
    private String name;
    private String color;

    public void changeName(String x) {
        name = x;
    }

    public void changeColor(String x) {
        color = x;
        if(name == null){
            System.out.println("This dog is "+this.color);
        }else if(!name.isEmpty() && this.color != null){
            System.out.println(name + " is "+color);
        }
        else{
            System.out.println(name + "is barking");
        }
    }

    public String bark() {
        if (name != null && color != null) {
            return name + " the " + color + " dog is barking";
        } else if (name != null) {
            return name + " is barking";
        } else if (color != null) {
            return color + " dog is barking";
        } else {
            return "A dog is barking";
        }
    }

    public static void main(String[] args) {
        Dog scooby = new Dog();
        Dog oldie = new Dog();
        Dog goofy = new Dog();

        scooby.changeName("Scooby");
        goofy.changeName("Goofy");

        System.out.println("1. ===============");
        System.out.println(scooby.bark());
        System.out.println("2. ===============");
        System.out.println(oldie.bark());
        System.out.println("3. ===============");
        oldie.changeColor("White");
        System.out.println("4. ===============");
        System.out.println(oldie.bark());
        System.out.println("5. ===============");
        System.out.println(goofy.bark());
        System.out.println("6. ===============");
        scooby.changeColor("Brown");
        System.out.println("7. ===============");
        System.out.println(scooby.bark());
        System.out.println("8. ===============");
        goofy.changeColor("Black");

    }
}
