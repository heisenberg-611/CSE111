public class Painter {
    public String name;
    public String number;
    public String exp;
    public static int pCount;

    public Painter(String name, String number, String exp) {
        this.name = name;
        this.number = number;
        this.exp = exp;
        pCount++;
    }

    public void showLevel(String name){
        if(!name.equals(this.name)){
            System.out.println("Can't show the experience. Name does not match.");
        } else {
            System.out.println("User_Name: "+this.name);
            System.out.println("Experience: "+this.exp);
        }
    }

    public void changeNumber(String name, String number){
        if(!name.equals(this.name)){
            System.out.println("Can't change the number. You have entered an unknown name.");
        } else {
            this.number = number;
            System.out.println("Changed number successfully for "+this.name);
        }
    }

    public void showDetails(){
        System.out.println("User_Name: "+this.name);
        System.out.println("Phone no: "+this.number);
        System.out.println("Experience: "+this.exp);
        System.out.println();
    }

    public static void showPainterCount(){
        System.out.println("Total numbers of painters are: "+pCount);
    }

    public static void main(String[] args) {
        Painter p1 = new Painter("Ruhan01","01326548339","Beginner");
        p1.showDetails();
        System.out.println("1####################");
        p1.showLevel("Ruhan01");
        p1.changeNumber("Ruhan", "0132564");
        p1.showDetails();
        System.out.println("2#####################");
        Painter.showPainterCount();
        System.out.println("3#####################");
        Painter p2 = new Painter("Nazia11", "01638069377", "Intermediate");
        p2.showDetails();
        p2.changeNumber("Nazia11", "01638369852");

        System.out.println("4#####################");
        p2.showLevel("Ontu1");
        Painter p3 = new Painter ("Tania", "01324789633","Beginner");
        Painter p4 = new Painter("Anika", "01324911233","Pro");
        p4.changeNumber("Anika", "01327643");
        System.out.println("5#####################");
        p3.showDetails();
        Painter pS = new Painter("Sadia", "01327854234","Pro");
        Painter.showPainterCount();
    }
}
