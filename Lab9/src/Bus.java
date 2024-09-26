public class Bus {
    public int capacity;
    public int pCount;
    public String destination;
    public Bus(int c, String d){
        capacity = c;
        destination = d;
        System.out.println("Capacity: "+ c);
        System.out.println("Destination: "+ d);
    }
    public void addPassenger(String name, String d){
        if(pCount>=this.capacity){
            System.out.println("Bus is full.");
        } else {
            if(!destination.equals(d)){
                System.out.println("Sorry "+name+"! The bus won't stop at "+d);
                System.out.println("Use another bus.");
            } else {
                pCount++;
                System.out.println(name+" is added to the bus.");
            }
        }
    }
    public void addPassenger(String name){
        pCount++;
        System.out.println(name+" is added to the bus.");
        System.out.println(name + " will get off at the last stop.");
    }
    public static void main(String args[]){
        Bus b1 = new Bus(4, "Jatrabari");
        System.out.println("1--------------");
        Bus b2 = new Bus(10, "Gazipur");
        System.out.println("2--------------");
        b1.addPassenger("Fahim", "Mirpur");
        System.out.println("3--------------");
        b1.addPassenger("Anika", "Jatrabari");
        System.out.println("4--------------");
        b1.addPassenger("Ali");
        System.out.println("5--------------");
        b1.addPassenger("Zafar");
        System.out.println("6--------------");
        b1.addPassenger("Mim", "Badda");
        b1.addPassenger("Nowrin");
        System.out.println("7--------------");
        b1.addPassenger("Walid", "Jatrabari");
    }
}
