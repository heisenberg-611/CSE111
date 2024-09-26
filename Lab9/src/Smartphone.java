public class Smartphone {
    public String name;
    public String[] featureNames;
    public String[] featureValues;
    public int featureCount;

    // Maximum number of features the phone can have
    public final int MAX_FEATURES = 10;

    // Default constructor
    public Smartphone() {
        this.name = null;
        this.featureNames = new String[MAX_FEATURES];
        this.featureValues = new String[MAX_FEATURES];
        this.featureCount = 0;
    }

    // Constructor with phone name
    public Smartphone(String name) {
        this.name = name;
        this.featureNames = new String[MAX_FEATURES];
        this.featureValues = new String[MAX_FEATURES];
        this.featureCount = 0;
    }

    // Method to update phone name
    public void updateName(String name) {
        this.name = name;
    }

    // Method to add feature
    public void addFeature(String key, String value) {
        if (this.name == null) {
            System.out.println("Feature can not be added without phone name");
            return;
        }

// Check if feature already exists
        for (int i = 0; i < featureCount; i++) {
            if (featureNames[i].equals(key)) {
// Update the existing feature by appending the value
                featureValues[i] += ", " + value;
                return;
            }
        }

// Add new feature if not already present
        if (featureCount < MAX_FEATURES) {
            featureNames[featureCount] = key;
            featureValues[featureCount] = value;
            featureCount++;
        } else {
            System.out.println("Cannot add more features, maximum capacity reached.");
        }
    }

    // Method to print phone details
    public void printDetail() {
        if (this.name != null) {
            System.out.println("Phone Name: " + this.name);
            for (int i = 0; i < featureCount; i++) {
                System.out.println(featureNames[i] + ": " + featureValues[i]);
            }
        } else {
            System.out.println("Phone Name: Not set");
        }
    }
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println("1===================");
        s1.addFeature("Display", "6.1 inch");
        System.out.println("2===================");
        s1.updateName("Samsung Note 20");
        s1.addFeature("Display", "6.1 inch");
        s1.printDetail();
        System.out.println("3===================");
        Smartphone s2 = new Smartphone("Iphone 12 Pro");
        s2.addFeature("Display", "6.2 inch");
        s2.addFeature("Ram", "6 GB");
        System.out.println("4===================");
        s2.printDetail();
        s2.addFeature("Display", "Amoled panel");
        s2.addFeature("Ram", "DDR5");
        System.out.println("5===================");
        s2.printDetail();
        System.out.println("6===================");
    }

}
