public class Taxi {
    public String[] name = new String[4];
    public int pCount;
    public int fare;
    Taxi(){
        System.out.println("A taxi is created");
    }

    public void info(){
        System.out.println("Total Passenger: "+pCount);
        System.out.println("Total Fare: "+fare);
        System.out.println("Passenger List:");
        for(int i=0;i<pCount;i++){
            System.out.print(name[i]+" ");
        }
        System.out.println();
    }

    public void addPassenger(String name){
        if(pCount>=4){
            System.out.println("Taxi is full");
        } else {
            System.out.println("Dear "+name+"! Welcome to Taxi");
            this.name[pCount]=name;
            pCount++;
            fare+=200;
        }
    }

    public void addPassenger(String name, int fare){
        if(pCount>=4){
            System.out.println("Taxi is full");
        } else {
            System.out.println("Dear "+name+"! Welcome to Taxi");
            this.name[pCount]=name;
            pCount++;
            this.fare+=fare;
        }
    }

    public static void main(String[] args) {
        Taxi t1 = new Taxi();
        System.out.println("1------------");
        t1.info();
        System.out.println("2------------");
        t1.addPassenger("Walker");
        t1.addPassenger("Matt");
        System.out.println("3------------");
        t1.info();
        System.out.println("4------------");
        t1.addPassenger("Wilson", 400);
        System.out.println("5------------");
        t1.info();
        System.out.println("6------------");
        t1.addPassenger("Henry", 150);
        System.out.println("7------------");
        t1.addPassenger("Marry");
        System.out.println("8------------");
        t1.info();
    }
}
