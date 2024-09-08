public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    Assignment(){
        this.tasks = 0;
        this.difficulty = "null";
        this.submission = false;
    }

    public void printDetails(){
        System.out.println("Number of tasks: "+tasks);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission);
    }

    public void makeOptional(){
        if(this.submission){
            this.submission = false;
            System.out.println("Assignment will not require submission");
        } else if(!this.submission) {
            System.out.println("Submission is already not required");
        }

    }

    public static void main(String[] args){
        Assignment as1 = new Assignment();
        as1.printDetails();
        System.out.println("1---------------");
        as1.tasks = 11;
        as1.difficulty = "Moderate";
        as1.submission = true;
        as1.printDetails();
        System.out.println("2---------------");
        as1.makeOptional();
        System.out.println("3---------------");
        as1.printDetails();
        System.out.println("4---------------");
        Assignment as2 = new Assignment();
        as2.tasks = 12;
        as2.difficulty = "Hard";
        as2.submission = false;
        as2.printDetails();
        System.out.println("5---------------");
        as2.makeOptional();
    }
}
