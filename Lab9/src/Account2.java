public class Account2 {
    public static int count;
    public String name;
    public int age;
    public String Occupation;
    public int amount;

    public Account2(String s, int a, String o, int at){
        this.name = s;
        this.age = a;
        this.Occupation = o;
        this.amount = at;
        count++;
    }

    public void addMoney(int money){
        amount+=money;
    }

    public void withdrawMoney(int money){
        if(money>amount){
            System.out.println("Insufficient money for withdrawal!");
        } else {
            amount -= money;
        }
    }

    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Occupation: "+Occupation);
        System.out.println("Total Amount: "+amount);
    }


    public static void main(String[] args) {
        System.out.println("Total Account holders: " + Account2.count);
        System.out.println("1================");
        Account2 p1 = new Account2("Abdul",45,"Service Holder",500000);
        p1.addMoney(300000);
        p1.printDetails();
        System.out.println("2================");
        Account2 p2 = new Account2("Rahim",55,"Businessman",700000);
        p2.withdrawMoney(700000);
        p2.printDetails();
        System.out.println("3================");
        Account2 p3 = new Account2("Ashraf",62,"Govt.Officer",200000);
        p3.withdrawMoney(250000);
        p3.printDetails();
        System.out.println("4================");
        System.out.println("Total Account holders: " + Account2.count);
    }

}
