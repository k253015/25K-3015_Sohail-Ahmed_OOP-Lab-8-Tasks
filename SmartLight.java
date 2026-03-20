
interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartFan implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart Fan On");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan Off");
    }
}
public class SmartLight implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart Light On");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light Off");
    }
    public static void main(String[] args){
        SmartDevice SL = new SmartLight();  
        SmartDevice SF = new SmartFan();  
        SL.turnOn();
        SL.turnOff();
        SF.turnOn();
        SF.turnOff();
    }
}
