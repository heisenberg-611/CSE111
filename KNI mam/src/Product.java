public class Product {
    public String name;
    public int price;

    public Product(String n, int p){
        name = n;
        price = p;
    }

    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
    public static void main(String args[]){
        Book b1 = new Book("Harry Potter",  23456859, 350);
        System.out.println("1-------------");
        b1.details();
        System.out.println("2-------------");
        Book b2 = new Book("Hamlet", 37991797, 500);
        b2.details();
    }
}
