public class CSEStudent extends Student {
    public CSEStudent(String n, int i) {
        super(n, i);
    }
    public static void details(){
        System.out.println("Total students: "+Student.count);
        System.out.println("Available Lab Based Courses: ");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }

    public void addLabBasedCourse(String lab){
        if(lab.equals("CSE230")){
            System.out.println("It is not a lab based course!");
        } else {
            this.courses += lab +" ";
        }
    }
}