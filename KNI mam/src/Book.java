public class Book extends Product {
    public int ISBN;

    public Book(String title, int ISBN, int price) {
        super(title, price);
        this.ISBN = ISBN;
    }

    public void details(){
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("ISBN: "+ ISBN);
    }
}
