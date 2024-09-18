public class Cargo {
    public int id;
    public static int Id;
    public String contents;
    public double weight;
    public static double capacity;
    public boolean loaded;

    public Cargo(String contents, double weight) {
        this.contents = contents;
        this.weight = weight;
        ++Cargo.Id;
        this.id = Cargo.Id;
        this.loaded = false;
    }

    public static double capacity() {
        if (Cargo.capacity == 0) {
            Cargo.capacity = 10;
            return Cargo.capacity;
        } else if(capacity<1 && capacity>0.5) {
            return Math.ceil(Cargo.capacity);
        } else {
            return Cargo.capacity;
        }
    }

    public void load() {
        if ((Cargo.capacity - this.weight) <= 0) {
            System.out.println("Cannot load cargo, exceeds capacity.");
        } else {
            Cargo.capacity = Cargo.capacity - this.weight;
            this.loaded = true;
            System.out.println("Cargo " + this.id + " loaded for transport.");
        }
    }

    public void unload() {
        Cargo.capacity = Cargo.capacity + this.weight;
        this.loaded = false;
        System.out.println("Cargo " + this.id + " unloaded.");
    }

    public void details() {
        System.out.print("Cargo ID: " + this.id + ", ");
        System.out.print("Contents: " + this.contents + ", ");
        System.out.print("Weight: " + this.weight + ", ");
        System.out.print("Loaded: " + this.loaded);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("1====================");
        Cargo a = new Cargo("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");
        a.load();
        System.out.println("3====================");
        Cargo b = new Cargo("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("5====================");
        b.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("6====================");
        Cargo c = new Cargo("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");
        c.details();
        b.details();
        System.out.println("8====================");
        Cargo d = new Cargo("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("9====================");
        b.unload();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("10====================");
        c.load();
        System.out.println("11====================");
        b.details();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
    }
}
