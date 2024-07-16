public class UberApp {

    public String name;
    public int age;
    public String number;
    public String[] destination = new String[3];
    public double[] fare = new double[3];
    public int bookCount;
    public int remainingRides;

    public void createProfile(String name, int age, String number){
        this.name = name;
        this.age = age;
        this.number = number;
        bookCount = 0;
    }

    public void showProfile(){
        System.out.println("Hello! This is your profile:");
        System.out.println("Full name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.number);
    }

    public void bookRide(String destination, double distance){
        if (bookCount == 3) {
            System.out.println(this.name + ", please update your plan to premium or wait till next month!");
        } else {
            System.out.println(this.name + " has booked a ride!");
            this.destination[bookCount] = destination;
            this.fare[bookCount] = distance * 30.0;
            System.out.println("Destination: " + destination);
            System.out.println("Fare: " + this.fare[bookCount] + " Taka");
            bookCount++;
        }
    }

    public void changeLocation(String destination, double distance){
        if (bookCount > 0) {
            this.destination[bookCount - 1] = destination;
            double newFare = distance * 30;
            this.fare[bookCount - 1] = newFare + newFare * 0.2;
            System.out.println(this.name + " has changed the destination of his current ride to " + destination);
            System.out.println("New fare after adding 20% change fees: " + this.fare[bookCount - 1] + " Taka.");
        }
    }

    public void resetMonth(){
        bookCount = 0;
        for (int i = 0; i < 3; i++) {
            destination[i] = null;
            fare[i] = 0;
        }
    }

    public String remainingRides(){
        return "You have " + (3 - bookCount) + " ride(s) remaining.";
    }

    public void ridingHistory(){
        System.out.print(this.name + ", you have visited ");
        boolean hasRides = false;
        for (int i = 0; i < bookCount; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(this.destination[i]);
            hasRides = true;
        }
        if (!hasRides) {
            System.out.print("nowhere this month.");
        }
        System.out.println(" this month.");
    }

    public static void main(String[] args) {
        UberApp account1 = new UberApp();
        UberApp account2 = new UberApp();

        account1.createProfile("Jonas Kahnwald", 24, "017111111111");
        account2.createProfile("Martha Nielsen", 28, "018111111111");

        account1.showProfile();
        System.out.println("===== 1 ====");
        System.out.println(account1.remainingRides());

        System.out.println("==== 2 ====");
        account2.showProfile();
        System.out.println(account2.remainingRides());

        System.out.println("==== 3 ====");
        account1.bookRide("Merul Badda", 12.0);

        System.out.println("==== 4 ====");
        account1.bookRide("Dhanmondi 27", 4.3);
        account1.changeLocation("Wari", 5.6);

        System.out.println("==== 5 ====");
        account1.ridingHistory();

        System.out.println("==== 6 ====");
        account2.ridingHistory();

        System.out.println("==== 7 ====");
        account1.bookRide("Banani 11", 6.8);
        account1.bookRide("Gulshan 1", 2.1);

        System.out.println("==== 8 ====");
        account1.resetMonth();
        account1.bookRide("Gulshan 1", 2.1);
        account1.ridingHistory();
        System.out.println(account1.remainingRides());
    }
}