public class MagicItem {
    public String name;
    public int energyLevel;
    public String[] magicItem = new String[3];
    public int i;
    public int itemCount;

    public void newCharacter(String name){
        this.name = name;
        this.energyLevel = 0;
        this.i = 0;
        this.itemCount = 0;
    }

    public void displayInfo(){
        System.out.println("Character Name: " + name);
        System.out.println("Energy Level: " + energyLevel);
        int j = 1;
        for(String item : magicItem) {
            System.out.println("Item " + j + ":" + item);
            j++;
        }
    }

    public void findItem(String magicItem){
        if(itemCount==this.magicItem.length){
            System.out.println("All items slots occupied.");
        }
        else {
            if (itemCount < this.magicItem.length) {
                this.magicItem[itemCount] = magicItem;
                itemCount++;
            } else {
                this.magicItem[i] = magicItem;
                i++;
            }
            System.out.println(name + " found a " + magicItem);
        }
    }

    public void useItem(String magicItem){
        boolean itemUsed = false;
        for (int k = 0; k < this.magicItem.length; k++) {
            if (this.magicItem[k] != null && this.magicItem[k].equals(magicItem)) {
                System.out.println(name + " used a " + magicItem);
                switch (magicItem) {
                    case "Potion":
                        energyLevel += 50;
                        System.out.println("Energy Level after using item: " + energyLevel);
                        break;
                    case "Elixir":
                        energyLevel += 100;
                        System.out.println("Energy Level after using item: " + energyLevel);
                        break;
                    case "Amulet":
                        energyLevel += 200;
                        System.out.println("Energy Level after using item: " + energyLevel);
                        break;
                    default:
                        break;
                }
                this.magicItem[k] = null;
                itemCount-=1;
                itemUsed = true;
                break;
            }
            else{
                itemCount--;
            }
        }
        if (!itemUsed) {
            System.out.println("Item not in inventory.");
        }
    }

    public static void main(String[] args){
        MagicItem char1 = new MagicItem();
        MagicItem char2 = new MagicItem();

        char1.newCharacter("Eleven");
        char2.newCharacter("Mike Wheeler");

        System.out.println("1 ===========");
        char1.displayInfo();
        System.out.println("2 ===========");
        char2.displayInfo();
        System.out.println("3 ===========");
        char1.findItem("Potion");
        char1.findItem("Elixir");
        char1.findItem("Elixir");
        char2.findItem("Potion");
        System.out.println("4 ===========");
        char1.findItem("Amulet");
        System.out.println("5 ===========");
        char1.displayInfo();
        System.out.println("6 ===========");
        char1.useItem("Potion");
        char1.useItem("Elixir");
        System.out.println("7 ===========");
        char1.displayInfo();
        System.out.println("8 ===========");
        char1.findItem("Amulet");
        System.out.println("9 ===========");
        char1.displayInfo();
        System.out.println("10 ===========");
        char2.useItem("Amulet");
        System.out.println("11 ===========");
        char2.displayInfo();
    }
}