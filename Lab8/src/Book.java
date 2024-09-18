public class Book {
    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    public double price;

    Book (String title, int discount) {
        this.title = title;
        this.price = 150 - (150*(discount/100.0));
    }

    public void bookDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Price after Discount: " + this.price + " TK");
        total_books_sold ++;
        total_revenue += this.price;
    }

    public static void main(String[] args) {
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
        System.out.println("==========1==========");

        Book b1 = new Book("Java Programming", 10); // 10% discount
        b1.bookDetails();

        System.out.println("==========2==========");

        Book b2 = new Book("Python Programming", 15); // 15% discount
        b2.bookDetails();

        System.out.println("==========3==========");

        Book b3 = new Book("Data Structures", 5); // 5% discount
        b3.bookDetails();

        System.out.println("==========4==========");
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    }

}
