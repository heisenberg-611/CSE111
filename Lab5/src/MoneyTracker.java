public class MoneyTracker {
    public String name;
    public double balance;
    public double lastAdded;
    public double lastSpent;
    public double spent;

    public String info(){
        System.out.println("Name: " + name );
        return "Current Balance: " + balance;
    }

    public void createTracker(String name){
        this.name = name;
        balance = 1.0;
    }

    public void income(double balance){
        this.balance += balance;
        lastAdded = balance;
        System.out.println("Balance Updated!");
    }

    public void expense(double spent){
        if(spent < balance){
            this.spent = spent;
            lastSpent = spent;
            balance -= spent;
            System.out.println("Balance Updated!");
        }
        else if(spent > balance){
            System.out.println("Not enough balance.");
        }
        if(spent == balance){
            System.out.println("You're broke!");
        }
    }

    public void showHistory(){
        System.out.println("Last added:" + lastAdded);
        System.out.println("Last spent:" + lastSpent);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");
        System.out.println("1 ==========");
        emp1.displayInfo();
        System.out.println("2 ==========");
        emp2.displayInfo();
        System.out.println("3 ==========");
        emp3.displayInfo();
        System.out.println("4 ==========");
        emp1.calculateTax();
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        System.out.println("6 ==========");
        emp1.calculateTax();
        System.out.println("7 ==========");
        emp1.displayInfo();
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        System.out.println("9 ==========");
        emp3.calculateTax();
        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}