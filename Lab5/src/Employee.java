public class Employee {
    public String name;
    public double salary;
    public String designation;

    public void newEmployee(String x) {
        this.name = x;
        this.salary = 30000.0; // Initialize salary
        this.designation = "junior"; // Initialize designation
    }

    public void displayInfo() {
        System.out.printf("Employee Name: %s\n", this.name);
        System.out.printf("Employee Salary: %.1f Tk\n", this.salary);
        System.out.printf("Employee Designation: %s\n", this.designation);
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
}