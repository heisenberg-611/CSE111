public class Book {
    public String title;
    public String author;
    public int price;

    Book(String title){
        this.title = title;
        this.author = "";
        this.price = 0;
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        if(this.author.isEmpty() && this.price == 0){
            System.out.println("Title: " + this.title);
        } else if(this.price == 0){
            System.out.print("Title: " + this.title +", ");
            System.out.println("Author: " + this.author);
        } else {
            System.out.print("Title: " + this.title +", ");
            System.out.print("Author: " + this.author+", ");
            System.out.println("Price: " + this.price);
        }
    }

    public void setDetails(int price){
        this.price = price;
    }

    public void setDetails(String author, int price){
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("< —--—----1—-------->");
        Book b1 = new Book("The Alchemist");
        b1.displayDetails();
        System.out.println("< —--—----2—-------->");
        Book b2 = new Book("1984", "George Orwell");
        b2.displayDetails();
        System.out.println("< —--—----3—-------->");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", 300);
        b3.displayDetails();
        System.out.println("< —--—----4—-------->");
        b1.setDetails(250);
        b1.displayDetails();
        System.out.println("< —--—----5—-------->");
        b2.setDetails("Orwell", 350);
        b2.displayDetails();
    }

}
