public class Parcel {
    public String name;
    public double fee;
    public int weight;

    Parcel(){
        this.name = "";
        this.fee = 0;
        this.weight = 0;
    }

    Parcel(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    Parcel(String name){
        this.name = name;
    }

    public void printDetails(){
        if(this.name.isEmpty()){
            System.out.println("Set name first");
        } else {
            System.out.println("Name: "+this.name);
            System.out.println("Total Weight: "+this.weight);
            System.out.println("Total Fee: "+this.fee);
        }
    }

    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("Updated weight: "+this.weight);
    }

    public void calcFee(String place){
        switch (place) {
            case "Gulshan", "Banani" -> this.fee = (this.weight * 20) + 0.0;
            case "Dhanmondi" -> this.fee = (this.weight * 20) + 50.0;
        }
    }

    public static void main(String[] args){
        Parcel p1 = new Parcel();
        p1.printDetails();
        p1.name = "Spongebob";
        p1.printDetails();
        System.out.println("1**************");
        Parcel p2 = new Parcel("Bob the Builder");
        p2.weight = 15;
        p2.calcFee("Gulshan");
        p2.printDetails();
        System.out.println("2**************");
        p2.addWeight(25);
        p2.calcFee("Banani");
        p2.printDetails();
        System.out.println("3**************");
        Parcel p3 = new Parcel("Dora the Explorer", 10);
        p3.addWeight(15);
        p3.calcFee("Dhanmondi");
        p3.printDetails();
    }

}
