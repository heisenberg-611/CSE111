public class Smartphone {
    public String name;
    public String[] feature_type;
    public String[] feature;
    public final int maxFeature = 10;
    public int featureCount;
    public Smartphone(){
        this.name = null;
        this.feature_type = new String[maxFeature];
        this.feature = new String[maxFeature];
        this.featureCount = 0;
    }

    public Smartphone(String name){
        this.name = name;
        this.feature_type = new String[maxFeature];
        this.feature = new String[maxFeature];
        this.featureCount = 0;
    }

    public void updateName(String name) {
        this.name = name;
    }


    public void addFeature(String x, String y){
        if(name==null){
            System.out.println("Feature cannot be added without phone name");
            return;
        }
        for(int i = 0; i < feature_type.length; i++){
            if(feature_type[i]!=null && feature_type[i].equals(x)){
                feature[i] += ", "+y;
                return;
            }
        }
        if (featureCount < maxFeature) {
            feature_type[featureCount] = x;
            feature[featureCount] = y;
            featureCount++;
        } else {
            System.out.println("Cannot add more features, maximum capacity reached.");
        }
    }

    public void printDetail() {
        if (this.name != null) {
            System.out.println("Phone Name: " + this.name);
            for (int i = 0; i < featureCount; i++) {
                System.out.println(feature_type[i] + ": " + feature[i]);
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
