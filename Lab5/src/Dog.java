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
        }else if(name.length() > 0 && this.color != null){
            System.out.println(name + " is "+color);
        }
        else{
            System.out.println(name + "is barking");
        }
    }

    public String bark() {
        if (name != null && name.length() > 0 && color != null && color.length() > 0) {
            return name + " the " + color + " dog is barking";
        } else if (name != null && name.length() > 0) {
            return name + " is barking";
        } else if (color != null && color.length() > 0) {
            return color + " dog is barking";
        } else {
            return "A dog is barking";
        }
    }
}