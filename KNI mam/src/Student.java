public class Student {
    public static int studentCount;
    public String name;
    public int ID;
    public Student (String name, int ID) {
        this.name = name;
        this.ID = ID;
        studentCount++;
        System.out.println("A student is created!");
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
    }

    public static Student createStudent(String name, int ID) {
        return new Student(name, ID);
    }


        public static void main (String[] args){
            System.out.println("Total Student: " + Student.studentCount);
            System.out.println("1------------");
            Student s1 = new Student("Ali", 34);
            System.out.println("2------------");
            s1.info();
            System.out.println("3------------");
            Student s2 = new Student("Afia", 45);
            System.out.println("4------------");
            s2.info();
            System.out.println("5------------");
            Student s3 = Student.createStudent("Afroza", 64);
            System.out.println("6------------");
            s3.info();
            System.out.println("7------------");
            System.out.println("Total Student: " + Student.studentCount);
        }
    }
