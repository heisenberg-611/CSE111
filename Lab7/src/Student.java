public class Student {
    public String name;
    public String prog;

    Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    public String accessName() {
        return this.name;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateProgram(String newProg) {
        this.prog = newProg;
    }

    public String accessProgram() {
        return this.prog;
    }

    public static void main(String[] args){
        Student s1 = new Student("Harry", "CSE");
        System.out.println(s1.name);
        s1.updateName("Harry Potter");
        System.out.println(s1.accessName());
        System.out.println(s1.prog);
        s1.updateProgram("CS");
        String prog = s1.accessProgram();
        System.out.println(prog);
    }
}
