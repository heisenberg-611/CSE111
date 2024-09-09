public class LightController {
    public String light;
    public int brightness;

    LightController(){
        brightness = 0;
        light = "OFF";
    }

    public void showLightStatus(){
        System.out.println("Light status: " + light);
        System.out.println("Brightness Level: " + brightness);
    }

    public void switchLight(){
        if(light.equals("OFF")){
            light = "ON";
            this.brightness = 1;
            System.out.println("Lights are now ON.");
        } else {
            light = "OFF";
            this.brightness = 0;
            System.out.println("Lights are now OFF.");
        }
    }

    public void adjustBrightness(int n){
        if(light.equals("OFF")){
            System.out.println("Please turn on the light first!");
        } else if ((brightness+n)>=0 && (brightness+n)<=10) {
            this.brightness += n;
            System.out.println("Brightness adjusted");
        } else {
            System.out.println("Brightness out of range. Set between 0 to 10.");
        }
    }

    public String resetSettings(){
        this.light = "ON";
        this.brightness = 1;
        return "Light settings have been reset.";
    }

    public static void main(String[] args){
        LightController c1 = new LightController();
        c1.showLightStatus();
        System.out.println("1---------------");
        c1.adjustBrightness(4);
        c1.switchLight();
        System.out.println("2---------------");
        c1.showLightStatus();
        System.out.println("3---------------");
        c1.adjustBrightness(4);
        System.out.println("4---------------");
        c1.showLightStatus();
        System.out.println("5---------------");
        c1.adjustBrightness(-2);
        c1.adjustBrightness(9);
        System.out.println("6---------------");
        c1.showLightStatus();
        System.out.println("7---------------");
        System.out.println(c1.resetSettings());
        c1.showLightStatus();
        System.out.println("8---------------");
        c1.switchLight();
        System.out.println("9---------------");
        c1.showLightStatus();
    }

}
