//public class Student {
//    public static int studentCount;
//    public String name;
//    public int ID;
//    public Student (String name, int ID) {
//        this.name = name;
//        this.ID = ID;
//        studentCount++;
//        System.out.println("A student is created!");
//    }
//
//    public void info(){
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + ID);
//    }
//
//    public static Student createStudent(String name, int ID) {
//        return new Student(name, ID);
//    }
//
//
//        public static void main (String[] args){
//            System.out.println("Total Student: " + Student.studentCount);
//            System.out.println("1------------");
//            Student s1 = new Student("Ali", 34);
//            System.out.println("2------------");
//            s1.info();
//            System.out.println("3------------");
//            Student s2 = new Student("Afia", 45);
//            System.out.println("4------------");
//            s2.info();
//            System.out.println("5------------");
//            Student s3 = Student.createStudent("Afroza", 64);
//            System.out.println("6------------");
//            s3.info();
//            System.out.println("7------------");
//            System.out.println("Total Student: " + Student.studentCount);
//        }
//    }

public class Student{
    public String name;
    public int id;
    public String courses = "";
    public static int count;

    public Student(String n, int i){
        name = n;
        id = i;
        Student.count++;
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Courses: "+courses);
    }
    public static void main (String args[]){
        CSEStudent.details();
        System.out.println("1--------------");
        CSEStudent s1 =  new CSEStudent("Bob", 23);
        s1.info();
        System.out.println("2--------------");
        CSEStudent s2 =  new CSEStudent("Don", 33);
        s2.info();
        System.out.println("3--------------");
        s1.addLabBasedCourse("CSE220");
        s1.addLabBasedCourse("CSE221");
        System.out.println("4--------------");
        s1.info();
        System.out.println("5--------------");
        CSEStudent.details();
        System.out.println("6--------------");
        s1.addLabBasedCourse("CSE230");
        System.out.println("7--------------");
        s1.info();
        System.out.println("8--------------");
        s2.addLabBasedCourse("CSE110");
        s2.info();
    }

}
