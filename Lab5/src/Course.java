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
}
