public class Cart {

    public int cartNumber;
    public String[] carCapItem = new String[3];
    public double[] carCapPrice = new double[3];
    public int itemCount;
    public double discount;
    public double totalPrice;
    public double percentage;

    public void create_cart(int n) {
        cartNumber = n;
        itemCount = 0;
        totalPrice = 0;
        discount = 0;
    }

    public void addItem(String name, double price) {
        if (itemCount < carCapItem.length) {
            carCapItem[itemCount] = name;
            carCapPrice[itemCount] = price;
            totalPrice += price;
            itemCount++;
            System.out.println(name + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart.");
        }
    }

    public void cartDetails() {
        System.out.println("Your cart (c" + this.cartNumber + ") :");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(carCapItem[i] + " - " + carCapPrice[i]);
        }
        System.out.println("Discount Applied: " + this.percentage + "%");
        System.out.println("Total Price: " + (totalPrice - discount));
    }

    public void giveDiscount(int percentage) {
        this.percentage = percentage;
        discount = totalPrice * (percentage / 100.0);
    }

    public static void main(String[] args) {
        Cart c1 = new Cart();
        Cart c2 = new Cart();
        Cart c3 = new Cart();
        c1.create_cart(1);
        c2.create_cart(2);
        c3.create_cart(3);
        System.out.println("====1====");
        c1.addItem("Table", 3900.5);
        c1.addItem("Chair", 1400.76);
        c1.addItem("Television", 5400.87);
        c1.addItem("Refrigerator", 5000); // This should not be added
        System.out.println("====2====");
        c2.addItem("Stove", 439.90);
        System.out.println("====3====");
        c3.addItem("Chair", 1400.5);
        c3.addItem("Chair", 3400);
        System.out.println("====4====");
        c1.cartDetails();
        System.out.println("====5====");
        c2.cartDetails();
        System.out.println("====6====");
        c3.cartDetails();
        c1.giveDiscount(10); // Applying 10% discount
        System.out.println("====7====");
        c1.cartDetails();
    }
}
