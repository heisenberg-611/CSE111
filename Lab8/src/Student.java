public class Student {
    public static int cseStudent;
    public static int tStudent;
    public static int otherStudent;
    public static int id;
    public String name;
    public double cg;
    public String dept;

    public Student(String name, double cg){
        this.name = name;
        this.cg = cg;
        this.dept = "CSE";
        Student.tStudent++;
        Student.cseStudent++;
        Student.id++;
    }

    public Student(String name, double cg, String dept){
        this.name = name;
        this.cg = cg;
        this.dept = dept;
        Student.tStudent++;
        Student.id++;
    }

    public static Student createStudent(String name, double cg, String dept){
        otherStudent++;
        return new Student(name, cg, dept);
    }

    public static void printDetails(){
        System.out.println("Total student(s): " + Student.tStudent);
        System.out.println("CSE student(s): " + Student.cseStudent);
        System.out.println("Other Department Student(s): " + Student.otherStudent);
    }

    public void individualDetail(){
        System.out.println("ID: " + Student.id);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cg);
        System.out.println("Department: " + this.dept);
    }

    public static void main(String[] args) {
        Student.printDetails();
        System.out.println("--------------------");
        Student mikasa = new Student("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
        System.out.println("--------------------");
        Student harry = Student.createStudent("Harry", 2.5, "Charms");
        harry.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
        System.out.println("--------------------");
        Student levi = new Student("Levi", 3.33);
        levi.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
    }

}
