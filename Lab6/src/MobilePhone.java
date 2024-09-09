//Written by me
//public class MobilePhone {
//    public int[] Contact;
//    public String[] Name;
//    public int[] Phone;
//    public int nameCount;
//    public int phoneCount;
//    public int callView;
//
//    public void setContactCapacity(int capacity) {
//        Contact = new int[capacity];
//    }
//
//    public void details(){
//        System.out.println("Total contacts: "+ Contact.length);
//        System.out.println("Contact List: ");
//        for (String i : Name) {
//            System.out.print(i);
//        }
//        for(int j : Phone){
//            System.out.print(":");
//            System.out.print(j);
//            System.out.println();
//        }
//    }
//
//    public void addContact(String name, int number) {
//        if(nameCount == Name.length){
//            System.out.println("Storage full!!");
//        } else {
//            Name[nameCount] = name;
//            Phone[phoneCount] = number;
//            nameCount++;
//            phoneCount++;
//            System.out.println("The contact of "+ Name[nameCount] + "is added.");
//        }
//    }
//
//    public void makeCall(int number) {
//        String A = "";
//        for(int k = 0; k < phoneCount; k++) {
//            if(Phone[k] == number){
//                A = Name[k];
//            }
//        }
//        if(callView%2 == 0){
//            System.out.println("Calling "+A+" . . .");
//        } else {
//            System.out.println("Calling "+ number +" . . .");
//        }
//        callView++;
//    }
//
//    public static void main(String[] args){
//        MobilePhone m1 = new MobilePhone();
//        MobilePhone m2 = new MobilePhone();
//        m1.setContactCapacity(5);
//        m2.setContactCapacity(100);
//        m1.details();
//        System.out.println("1----------------");
//        m1.addContact("John", 9866);
//        m1.addContact("Maria", 7865);
//        System.out.println("2----------------");
//        m1.makeCall(9866);
//        System.out.println("3----------------");
//        m1.addContact("Henry", 2365);
//        System.out.println("4----------------");
//        m1.makeCall(7552);
//        m1.makeCall(2365);
//        System.out.println("5----------------");
//        m1.addContact("Gomes", 4589);
//        m1.addContact("Antony", 8421);
//        m1.addContact("Tony", 5789);
//        System.out.println("6----------------");
//        m1.details();
//    }
//
//}

//Fixed some error with GPT
public class MobilePhone {
    public String[] Name;
    public int[] Phone;
    public int nameCount;
    public int phoneCount;
    public int callView;

    public void setContactCapacity(int capacity) {
        Name = new String[capacity];
        Phone = new int[capacity];
    }

    public void details() {
        System.out.println("Total contacts: " + nameCount);
        System.out.println("Contact List: ");
        for (int i = 0; i < nameCount; i++) {
            System.out.println(Name[i] + ": " + Phone[i]);
        }
    }

    public void addContact(String name, int number) {
        if (nameCount == Name.length) {
            System.out.println("Storage full!!");
        } else {
            Name[nameCount] = name;
            Phone[phoneCount] = number;
            System.out.println("The contact of " + name + " is added.");
            nameCount++;
            phoneCount++;
        }
    }

    public void makeCall(int number) {
        String A = "";
        for(int k = 0; k < phoneCount; k++) {
            if(Phone[k] == number){
                A = Name[k];
            }
        }
        if(callView%2 == 0){
            System.out.println("Calling "+A+" . . .");
        } else {
            System.out.println("Calling "+ number +" . . .");
        }
        callView++;
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        MobilePhone m2 = new MobilePhone();
        m1.setContactCapacity(5);
        m2.setContactCapacity(100);
        m1.details();
        System.out.println("1----------------");
        m1.addContact("John", 9866);
        m1.addContact("Maria", 7865);
        System.out.println("2----------------");
        m1.makeCall(9866);
        System.out.println("3----------------");
        m1.addContact("Henry", 2365);
        System.out.println("4----------------");
        m1.makeCall(7552);
        m1.makeCall(2365);
        System.out.println("5----------------");
        m1.addContact("Gomes", 4589);
        m1.addContact("Antony", 8421);
        m1.addContact("Tony", 5789);
        System.out.println("6----------------");
        m1.details();
    }
}