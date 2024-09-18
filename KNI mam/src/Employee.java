//public class Employee {
//    public static String[] names;
//    public static int id;
//    public static int count;
//
//    public Employee(String name, int id){
//        Employee.names = new String[4];
//        Employee.names[count] = name;
//        Employee.count++;
//        Employee.id = id;
//    }
//
//    public static void allEmployeeInfo(){
//        System.out.println("Total Employee: " + Employee.count);
//        System.out.println("Employee List: ");
//        for(String x : names){
//            System.out.println(x);
//        }
//    }
//
//    public void details(){
//        System.out.println("Name: " + Employee.names[count]);
//        System.out.println("ID: " + Employee.id);
//        System.out.println("Total Employee: " + Employee.count);
//        System.out.println("Employee List: ");
//        for(String x : names){
//            System.out.println(x);
//        }
//    }
//
//
//
//    public static void main(String args[]){
//        Employee.allEmployeeInfo();
//        System.out.println("1------------");
//        Employee e1 = new Employee("Ashish", 23);
//        e1.details();
//        Employee.allEmployeeInfo();
//        System.out.println("2------------");
//        Employee e2 = new Employee("Nidhi", 45);
//        e2.details();
//        System.out.println("3------------");
//        Employee.allEmployeeInfo();
//        System.out.println("4------------");
//        Employee e3 = new Employee("Ali", 65);
//        e3.details();
//        System.out.println("5------------");
//        Employee.allEmployeeInfo();
//    }
//
//}

public class Employee {
    public String name;
    public int id;
    public static int count = 0;
    public static String[] names = new String[100];

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        Employee.names[Employee.count] = name;
        Employee.count++;
    }

    public static void allEmployeeInfo() {
        System.out.println("Total Employees: " + Employee.count);
        System.out.println("Employee List: ");
        for (String x : Employee.names) {
            if (x != null) {
                System.out.println(x);
            }
        }
    }

    public void details() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }

    public static void main(String[] args) {
        Employee.allEmployeeInfo();
        System.out.println("1------------");
        Employee e1 = new Employee("Ashish", 23);
        e1.details();
        Employee.allEmployeeInfo();
        System.out.println("2------------");
        Employee e2 = new Employee("Nidhi", 45);
        e2.details();
        Employee.allEmployeeInfo();
        System.out.println("3------------");
        Employee e3 = new Employee("Ali", 65);
        e3.details();
        Employee.allEmployeeInfo();
    }
}