//public class Student7 {
//    private String[] courses = new String[4];
//    private double cg;
//    private int studentID;
//    private int cCount;
//
//    Student7(int ID){
//        this.studentID = ID;
//    }
//
//    Student7(int ID, double cg){
//        this.studentID = ID;
//        this.cg = cg;
//    }
//
//    public void addCourse(String cName){
//        if(this.cg == 0.0){
//            System.out.println("Failed to add "+cName);
//            System.out.println("Set CG first");
//        } else {
//            if(this.cg<3 && cCount>3){
//                System.out.println("Failed to add "+cName);
//                System.out.println("CG is low. Can't add more than 3 courses.");
//            } else {
//                courses[cCount] = cName;
//                cCount++;
//            }
//        }
//    }
//
//    public void addCourse(String [] courses){
//        this.courses = courses;
//    }
//
//    public void setCG(double cg){
//        this.cg = cg;
//    }
//
//    public void setID(int ID){
//        this.studentID = ID;
//    }
//
//    public void rmAllCourse(){
//        this.courses = new String[4];
//        this.cCount = 0;
//    }
//
//    public void showAdvisee(){
//        if(courses == null){
//            System.out.println("No courses added");
//        } else {
//            System.out.println("Student ID: "+studentID+", "+"CGPA: "+cg);
//            System.out.println("Added courses are:");
//            for(String course: courses){
//                System.out.println(course);
//            }
//        }
//    }
//}

public class Student7 {
    private String[] courses = new String[4];
    private double cg;
    private int studentID;
    private int cCount;

    Student7(int ID) {
        this.studentID = ID;
        courses = new String[4];
    }

    Student7(int ID, double cg) {
        this.studentID = ID;
        this.cg = cg;
    }

    public void addCourse(String cName) {
        if (this.cg == 0.0) {
            System.out.println("Failed to add " + cName);
            System.out.println("Set CG first");
        } else {
            if (this.cg < 3 && cCount >= 3) {
                System.out.println("Failed to add " + cName);
                System.out.println("CG is low. Can't add more than 3 courses.");
            } else if (cCount >= 4) {
                System.out.println("Failed to add " + cName);
                System.out.println("Maximum 4 courses allowed.");
            } else {
                courses[cCount] = cName;
                cCount++;
            }
        }
    }

    public void addCourse(String[] newCourses) {
//        if(newCourses.length==5){
//            for (String course : newCourses) {
//                if (cCount < 4) {
//                    courses[cCount] = course;
//                    cCount++;
//                }
//            }
        if (newCourses.length + cCount > 4) {
            System.out.println("Failed to add " + newCourses[newCourses.length - 1]);
            System.out.println("Maximum 4 courses allowed.");
            for (String course : newCourses) {
                if (cCount < 4) {
                    courses[cCount] = course;
                    cCount++;
                }
            }
        } else {
            for (String course : newCourses) {
                if (cCount < 4) {
                    courses[cCount] = course;
                    cCount++;
                }
            }
        }
    }

    public void setCG(double cg) {
        this.cg = cg;
    }

    public void setID(int ID) {
        this.studentID = ID;
    }

    public void rmAllCourse() {
        this.courses = new String[4];
        this.cCount = 0;  // Reset the course count
    }

    public void showAdvisee() {
        if (cCount == 0) {
            System.out.println("Student ID: " + studentID + ", " + "CGPA: " + cg);
            System.out.println("No courses added.");
        } else {
            System.out.println("Student ID: " + studentID + ", " + "CGPA: " + cg);
            System.out.println("Added courses are:");
            for (int i = 0; i < cCount; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }
}

