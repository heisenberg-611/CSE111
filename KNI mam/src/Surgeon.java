public class Surgeon extends Doctor{   //1.5
    public int workingEx = 0;
    public String degree;


    public Surgeon(String n, int i, int w, String d){  //0.5
        super(n,i);      //1
        workingEx = w;    //0.5
        degree = d;       //0.5
        System.out.println("A surgeon is created");   //1
    }

    public void addDegree(String d){     //2
        degree = degree+ ","+d;
        System.out.println("New degree added.");
    }

    public void details(){     //2
        super.details();            //1
        System.out.println("Experience: "+workingEx + " years");
        System.out.println("Degree: "+degree);
    }
}
