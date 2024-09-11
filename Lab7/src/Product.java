public class Product {
    private String name;
    private double price;
    private int quantity;

    Product(){
        this.name = "Unknown";
        this.price = 0.0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
     public void displayInfo(){
         System.out.println("Product Name: " + this.name);
         System.out.println("Price: " + "$" + this.price);
     }
     public void displayInfo(boolean statement){
        if(statement){
            System.out.println("Product Name: " + this.name);
            System.out.println("Price: " + "$" + this.price);
            System.out.println("Quantity: " + this.quantity);
        }
     }
     public void setQuantity(int quantity){
        this.quantity = quantity;
     }

     public int getQuantity(){
        return this.quantity;
     }

     public double getPrice(){
        return this.price;
     }
}
