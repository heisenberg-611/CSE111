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
        System.out.println("Balance Updated.");
    }

    public void expense(double spent){
        if(spent < balance){
            this.spent = spent;
            lastSpent = spent;
            balance -= spent;
            System.out.println("Balance Updated.");
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

    public static void main(String[] args) {
        MoneyTracker tr1 = new MoneyTracker();
        System.out.println(tr1.info());
        tr1.createTracker("John");
        System.out.println("1 ==========");
        System.out.println(tr1.info());
        System.out.println("2 ==========");
        tr1.income(1000);
        System.out.println(tr1.info());
        System.out.println("3 ==========");
        tr1.expense(800);
        tr1.expense(100);
        System.out.println(tr1.info());
        System.out.println("4 ==========");
        tr1.showHistory();
        System.out.println("5 ==========");
        tr1.expense(101);
        System.out.println("6 ==========");
        tr1.expense(200);
        System.out.println("7 ==========");
        tr1.income(200);
        tr1.showHistory();
        System.out.println("8 ==========");
    }
}