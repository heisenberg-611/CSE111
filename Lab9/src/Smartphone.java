public class Smartphone {
    public String name;
    public String size;
    public String color;
    public String ram;
    public String ramtype;
    public Smartphone(){
        name = "";
    }
    public Smartphone(String name){
        this.name = name;
    }
    public void addFeature(String s, String size){
        if (name.isEmpty()) {
            System.out.println("Feature can not be added without phone name");
        }
        else if(s.equals("Display")) {
            if(size.equals("6.1 inch") || size.equals("6.2 inch")) {
                this.size = size;
            } else {
                this.color = size;
            }
        } else if (s.equals("Ram")) {
            if(size.equals("6 GB")) {
                this.ram = size;
            } else {
                this.ramtype = size;
            }
        }
    }

    public void updateName(String s){
        this.name=s;
    }

    public void printDetail(){
        if(color==null && ram == null && ramtype == null){
            System.out.println("Phone name: "+name);
            System.out.println("Display: "+size);
        } else if(ramtype == null && color == null){
            System.out.println("Phone name: "+name);
            System.out.println("Display: "+size);
            System.out.println("Ram: "+ram);
        } else{
            System.out.println("Phone name: "+name);
            System.out.println("Display: "+size+", "+color);
            System.out.println("Ram: "+ram);
            System.out.println("Ram type: "+ramtype);
        }
    }
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println("1===================");
        s1.addFeature("Display", "6.1 inch");
        System.out.println("2===================");
        s1.updateName("Samsung Note 20");
        s1.addFeature("Display", "6.1 inch");
        s1.printDetail();
        System.out.println("3===================");
        Smartphone s2 = new Smartphone("Iphone 12 Pro");
        s2.addFeature("Display", "6.2 inch");
        s2.addFeature("Ram", "6 GB");
        System.out.println("4===================");
        s2.printDetail();
        s2.addFeature("Display", "Amoled panel");
        s2.addFeature("Ram", "DDR5");
        System.out.println("5===================");
        s2.printDetail();
        System.out.println("6===================");
    }
}
