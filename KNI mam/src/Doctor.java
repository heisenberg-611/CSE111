public class Doctor{
    public String name;
    public int id;
    public static int count;

    public Doctor(String n, int i){
        name = n;
        id = i;
        System.out.println("A doctor is created");
        Doctor.count+=1;
    }
    public void details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    public static void main(String[] args){
        System.out.println("Total Doctor: "+Doctor.count);
        System.out.println("1----------------");
        Doctor d1 = new Doctor("Alif", 23);
        System.out.println("2----------------");
        d1.details();
        System.out.println("3----------------");
        System.out.println("Total Doctor: "+Doctor.count);
        System.out.println("4----------------");
        Surgeon s1 = new Surgeon("Ahnaf", 55, 4, "MBBS");
        System.out.println("5----------------");
        s1.details();
        System.out.println("6----------------");
        System.out.println("Total Doctor: "+Doctor.count);
        System.out.println("7----------------");
        s1.addDegree("FCPS");
        System.out.println("8----------------");
        s1.details();
        System.out.println("9----------------");
        Surgeon s2 = new Surgeon("Rony", 77, 7, "MBBS");
        System.out.println("10----------------");
        s2.details();
        System.out.println("11----------------");
        System.out.println("Total Doctor: "+Doctor.count);
    }
}

