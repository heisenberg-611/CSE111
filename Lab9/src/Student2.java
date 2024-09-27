public class Student2 {
    public static int sCount;
    public static int CSECount;
    public static int BBACount;
    public String name;
    public String department;

    public Student2(String name, String dept) {
        this.name = name;
        this.department = dept;
        if (dept.equals("CSE")) {
            sCount++;
            CSECount++;
        } else {
            sCount++;
            BBACount++;
        }
        System.out.println("Creating Student Number: " + sCount);
    }

    public void individualInfo() {
        if (this.department.equals("CSE")) {
            System.out.println(name + " is from " + department + " department");
            System.out.println("Serial of " + name + " among all department is: " + sCount);
            System.out.println("Serial of " + name + " in CSE department is: " + CSECount);
        }
        if (this.department.equals("BBA")) {
            System.out.println(name + " is from " + department + " department");
            System.out.println("Serial of " + name + " among all department is: " + sCount);
            System.out.println("Serial of " + name + " in BBA department is: " + BBACount);
        }
    }

    public static void totalInfo(){
        System.out.println("Total Students: "+sCount);
        System.out.println("Total CSE Students: "+CSECount);
        System.out.println("Total BBA Students: "+BBACount);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Naruto", "CSE");
        System.out.println("1----------------");

        s1.individualInfo();
        System.out.println("################");
        Student2.totalInfo();
        System.out.println("==================");
        Student2 s2 = new Student2("Sakura", "BBA");
        System.out.println("2----------------");
        s2.individualInfo();
        System.out.println("################");
        Student2.totalInfo();
        System.out.println("==================");
        Student2 s3 = new Student2("Shikamaru", "CSE");
        System.out.println("3----------------");
        s3.individualInfo();
        System.out.println("################");
        Student2.totalInfo();
        System.out.println("==================");
        Student2 s4 = new Student2("Deidara", "BBA");
        System.out.println("4----------------");
        s4.individualInfo();
        System.out.println("################");
        Student2.totalInfo();
    }
}
