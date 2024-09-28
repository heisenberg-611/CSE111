public class Employee {
    public String name;
    public String designation;
    public double salary;

    public void newEmployee(String name){
        this.name = name;
        this.designation = "junior";
        this.salary = 30000.0;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }

    public void calculateTax() {
        double tax;
        if (this.salary > 50000) {
            tax = this.salary * 0.3;
            System.out.printf("%s Tax Amount: %.2f Tk\n", this.name, tax);
        } else if (this.salary > 30000) {
            tax = this.salary * 0.1;
            System.out.printf("%s Tax Amount: %.2f Tk\n", this.name, tax);
        } else {
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String x) {
        this.designation = x;
        switch (this.designation) {
            case "senior":
                this.salary += 25000;
                break;
            case "lead":
                this.salary += 50000;
                System.out.printf("%s has been promoted to lead\nNew Salary: %.2f Tk\n", this.name, this.salary);
                break;
            case "manager":
                this.salary += 75000;
                System.out.printf("%s has been promoted to manager\nNew Salary: %.2f Tk\n", this.name, this.salary);
                break;
        }
    }
    public static void main(String[] args) {
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
