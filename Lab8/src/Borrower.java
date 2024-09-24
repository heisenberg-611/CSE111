public class Borrower {
    public static int[] book_count = {3, 3, 3};
    public static String[] book_name = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public int borrowCount;
    public String[] Books = new String[book_name.length]; // Max number of books a borrower can borrow

    public Borrower(String name){
        this.name = name;
        this.borrowCount = 0;
    }

    public void borrowBook(String title){
        switch (title) {
            case "Pather Panchali" -> {
                if (book_count[0] > 0) {
                    book_count[0]--;
                    Books[borrowCount] = title;
                    borrowCount++;
                } else {
                    System.out.println("Pather Panchali is not available.");
                }
            }
            case "Durgesh Nandini" -> {
                if (book_count[1] > 0) {
                    book_count[1]--;
                    Books[borrowCount] = title;
                    borrowCount++;
                } else {
                    System.out.println("Durgesh Nandini is not available.");
                }
            }
            case "Anandmath" -> {
                if (book_count[2] > 0) {
                    book_count[2]--;
                    Books[borrowCount] = title;
                    borrowCount++;
                } else {
                    System.out.println("Anandmath is not available.");
                }
            }
        }
    }

    public void borrowerDetails(){
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed: ");
        for (String book : Books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static void bookStatus(){
        System.out.println("Available Books: ");
        for (int i = 0; i < book_count.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public static int remainingBooks(String name){
        return switch (name) {
            case "Pather Panchali" -> book_count[0];
            case "Durgesh Nandini" -> book_count[1];
            case "Anandmath" -> book_count[2];
            default -> -1;
        };
    }

    public static void main(String[] args) {
        Borrower.bookStatus();
        System.out.println("*********1*********");
        Borrower b1 = new Borrower("Nabila");
        b1.borrowBook("Pather Panchali");
        b1.borrowBook("Anandmath");
        b1.borrowerDetails();
        System.out.println("*********2*********");
        Borrower b2 = new Borrower("Sadia");
        b2.borrowBook("Anandmath");
        b2.borrowBook("Durgesh Nandini");
        b2.borrowBook("Pather Panchali");
        b2.borrowerDetails();
        System.out.println("*********3*********");
        System.out.println(Borrower.remainingBooks("Anandmath") + " copies of Anandmath is remaining.");
        System.out.println("*********4*********");
        Borrower b3 = new Borrower("Anika");
        b3.borrowBook("Anandmath");
        Borrower.bookStatus();
        System.out.println("*********5*********");
        Borrower b4 = new Borrower("Oishi");
        b4.borrowBook("Anandmath");
        b4.borrowBook("Durgesh Nandini");
        b4.borrowerDetails();
    }
}
