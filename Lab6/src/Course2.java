//In task 6 two methods, addOneContent() and addTwoContents() were used.
//But, in Task 7 we used method overloading.
//addContent() method was used for both one and two parameters

public class Course2 {
    public String name;
    public String code;
    public String [] Syllabus = new String [4];
    public int courseTracker;

    public void createCourse(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void addContent(String content) {
        if(courseTracker < Syllabus.length) {
            Syllabus[courseTracker] = content;
            courseTracker++;
            System.out.println(content + " was added.");
        } else {
            System.out.println("Cannot add more content");
        }
    }
    public void addContent(String content1, String content2) {
        if (courseTracker + 2 <= Syllabus.length) {
            Syllabus[courseTracker] = content1;
            Syllabus[courseTracker + 1] = content2;
            courseTracker += 2;
            System.out.println(content1 + " was added.");
            System.out.println(content2 + " was added.");
        } else if (courseTracker + 1 == Syllabus.length) {
            Syllabus[courseTracker] = content1;
            courseTracker++;
            System.out.println(content1 + " was added.");
            System.out.println("Cannot add more content");
        } else {
            System.out.println("Cannot add more content");
        }
    }

    public void printDetails() {
        System.out.println("Course details: ");
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus:");
        if(courseTracker == 0) {
            System.out.println("No content yet.");
        } else {
            for (int i = 0; i < courseTracker; i++) {
                System.out.print(Syllabus[i]);
                if (i < courseTracker - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Course2 c1 = new Course2();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addContent("Encapsulation");
        c1.addContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addContent("Inheritance");
        System.out.println("--------5--------");
        Course2 c2 = new Course2();
        c2.createCourse("DS", "CS22");
        c2.addContent("Stack");
        c2.addContent("Recursion","Tree");
        c2.addContent("Heap","Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
    }

}
