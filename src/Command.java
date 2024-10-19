interface Button{
    void press();
}
class RemoteControl{
    private Button button;

    public void setButton(Button button) {
        this.button = button;
    }

    public void pressButton(){
        if(button!=null){
            button.press();
        }
    }
}

class Light{
    public void turnOn(){
        System.out.printf("On");
    }
    public void turnOff(){
        System.out.printf("Off");
    }
}

class turnLightOn implements Button{
    private Light light;

    public turnLightOn(Light light) {
        this.light = light;
    }
    @Override
    public void press(){
        light.turnOn();
    }
}
class turnLightOff implements Button{
    private Light light;

    public turnLightOff(Light light) {
        this.light = light;
    }
    @Override
    public void press(){
        light.turnOff();
    }

}
class Main{
    public static void main(String[] args) {
        Light light= new Light();
        turnLightOn on=new turnLightOn(light);
        turnLightOff off=new turnLightOff(light);

        RemoteControl remote= new RemoteControl();
        remote.setButton(on);
        remote.pressButton();
        remote.setButton(on);
        remote.pressButton();
    }
}