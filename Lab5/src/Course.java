public class Course {
    public String cName;
    public String code;
    public int credit;
    // Write your code here
    public void createCourse(String x, String y, int z){
        cName = x;
        code = y;
        credit = z;
    }

    public void displayCourse(){
        System.out.println("Course name: "+ cName);
        System.out.println("Course code: "+ code);
        System.out.println("Course credit: "+ credit);
    }
    public void updateCourse(String x, String y, int z){
        cName = x;
        code = y;
        credit = z;
    }

    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course();

        System.out.println("========== 1 ==========");
        c1.createCourse("Programming Language I", "CSE110", 3);
        c1.displayCourse();

        System.out.println("========== 2 ==========");
        c2.createCourse("Data Structures", "CSE220", 3);
        c2.displayCourse();

        System.out.println("========== 3 ==========");
        c1.updateCourse("Programming Language II", "CSE111", 3);
        c1.displayCourse();
    }
}
