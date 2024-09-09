public class ChickenBurger {
    public String bun;
    public int price;
    public String sauceOption;
    public String spiceLevel;

    ChickenBurger(){
        bun = "Sesame";
        price = 200;
        sauceOption = "Less";
        spiceLevel = "Not set";
    }

    public String serveBurger(){
        if(spiceLevel.equals("Not set")){
            return "Cannot serve now. Customize Spice Level first.";
        } else if(bun.isEmpty()){
            return "Cannot serve now. Customize Bun first.";
        } else if (sauceOption.isEmpty()) {
            return "Cannot serve now. Customize Sauce option first.";
        } else {
            System.out.println("The burger is being served:-");
            System.out.println("Bun Type: " + bun);
            System.out.println("Price: " + price);
            System.out.println("Sauce Option: " + sauceOption);
            return "Spice Level: " + spiceLevel;
        }
    }

    public void customizeSpiceLevel(String spiceLevel) {
        switch (spiceLevel) {
            case "Mild" -> {
                this.spiceLevel = "Mild";
                System.out.println("Spice level set to Mild");
            }
            case "Spicy" -> {
                this.spiceLevel = "Spicy";
                System.out.println("Spice level set to Spicy");
            }
            case "Naga" -> {
                this.spiceLevel = "Naga";
                System.out.println("Spice level set to Naga");
            }
            case "Extreme" -> {
                this.spiceLevel = "Extreme";
                System.out.println("Spice level set to Extreme");
            }
            default -> System.out.println("This spice level is unavailable");
        }
    }

    public static void main(String [] args){
        ChickenBurger b1 = new ChickenBurger();
        System.out.println(b1.bun);
        System.out.println(b1.price);
        System.out.println(b1.sauceOption);
        System.out.println(b1.spiceLevel);
        System.out.println("----------1----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------2----------");
        b1.customizeSpiceLevel("Extreme Jhaal");
        b1.customizeSpiceLevel("Spicy");
        System.out.println("----------3----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------4----------");
        ChickenBurger b2 = new ChickenBurger();
        b2.bun = "Brioche";
        b2.price += 50;
        b2.sauceOption = "Regular";
        b2.customizeSpiceLevel("Naga");
        System.out.println("----------5----------");
        System.out.println(b2.serveBurger());
    }

}
