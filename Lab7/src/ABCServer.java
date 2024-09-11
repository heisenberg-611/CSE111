//public class ABCServer {
//    public String name;
//    public int capacity;
//    public int memberCount;
//    public String[] members;
//    public String[] role;
//
//    ABCServer(){
//        this.name = "Default";
//        this.capacity = 10;
//        this.memberCount = 0;
//        this.members = new String[capacity];
//    }
//
//    ABCServer(String name, int capacity){
//        this.name = name;
//        this.capacity = capacity;
//        this.memberCount = 0;
//        this.members = new String[capacity];
//    }
//
//    public void addMembers(String name){
//        for(int i = 0; i < memberCount; i++){
//            this.members[i] = name;
//        }
//        System.out.println("Rising hero is added.");
//    }
//
//    public void addMembers(String name, String role){
//        for(int i = 0; i < memberCount; i++){
//            this.members[i] = name;
//            this.role[i] = role;
//        }
//        System.out.println(role+" is added.");
//    }
//
//    public void details(){
//        System.out.println("Server Name: "+this.name);
//        System.out.println("Member Capacity: "+this.capacity);
//        System.out.println("Total Member: "+this.memberCount);
//        System.out.println("Members: ");
//        for(int i = 0; i < memberCount; i++){
//            System.out.println("Name:Role --> "+this.members[i]+":"+this.role[i]);
//        }
//    }
//
//    public static void main (String args []){
//        ABCServer server1 = new ABCServer();
//        server1.details();
//        System.out.println("---------------");
//        ABCServer server2 = new ABCServer("Heroes Reborn",6);
//        server2.details();
//        System.out.println("---------------");
//        server2.addMembers("Edward");
//        server2.addMembers("William");
//        System.out.println("----------------");
//        server2.details();
//        System.out.println("----------------");
//        server2.addMembers("John", "Hero's Mentor");
//        server2.addMembers("Albert", "Thunderstrike");
//        server2.addMembers("Max", "Radiant Avenger");
//        System.out.println("----------------");
//        server2.details();
//        System.out.println("----------------");
//        server2.addMembers("Daniel");
//        server2.addMembers("Donal", "Valor Knight");
//        System.out.println("----------------");
//        server2.details();
//    }
//
//}

public class ABCServer {
    public String name;
    public int capacity;
    public int memberCount;
    public String[] members;
    public String[] role;

    ABCServer() {
        this.name = "Default";
        this.capacity = 10;
        this.memberCount = 0;
        this.members = new String[capacity];
        this.role = new String[capacity];
    }

    ABCServer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.memberCount = 0;
        this.members = new String[capacity];
        this.role = new String[capacity];
    }

    public void addMembers(String name) {
        if (memberCount >= capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
            return;
        }
        this.members[memberCount] = name;
        this.role[memberCount] = "Rising Hero";
        System.out.println("Rising Hero is added.");
        memberCount++;
    }

    public void addMembers(String name, String role) {
        if (memberCount >= capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
            return;
        }
        this.members[memberCount] = name;
        this.role[memberCount] = role;
        System.out.println(role + " is added.");
        memberCount++;
    }

    public void details() {
        System.out.println("Server Name: " + this.name);
        System.out.println("Member Capacity: " + this.capacity);
        System.out.println("Total Members: " + this.memberCount);
        System.out.println("Members: ");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("Name:Role --> " + this.members[i] + ":" + this.role[i]);
        }
    }

    public static void main(String[] args) {
        ABCServer server1 = new ABCServer();
        server1.details();
        System.out.println("---------------");

        ABCServer server2 = new ABCServer("Heroes Reborn", 6);
        server2.details();
        System.out.println("---------------");

        server2.addMembers("Edward");
        server2.addMembers("William");
        System.out.println("----------------");

        server2.details();
        System.out.println("----------------");

        server2.addMembers("John", "Hero's Mentor");
        server2.addMembers("Albert", "Thunderstrike");
        server2.addMembers("Max", "Radiant Avenger");
        System.out.println("----------------");

        server2.details();
        System.out.println("----------------");

        server2.addMembers("Daniel");
        server2.addMembers("Donal", "Valor Knight");
        System.out.println("----------------");

        server2.details();
    }
}


