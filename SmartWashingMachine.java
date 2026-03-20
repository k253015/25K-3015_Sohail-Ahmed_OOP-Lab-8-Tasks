

abstract class Appliance{
    abstract void start();
}
interface RemoteControl{
    void controlRemotely();
}
class SmartRefrigerator extends Appliance implements RemoteControl{
    @Override
    void start(){
        System.out.println("Smart Refrigerator Started");
    }

    @Override
    public void controlRemotely() {
        System.out.println("Smart Refrigerator Can Be Controlled through Mobile");
    }
}

public class SmartWashingMachine extends Appliance implements RemoteControl{
    @Override
    void start(){
        System.out.println("Smart Washing Machine Can Be Controlled smartly");
    }

    @Override
    public void controlRemotely() {
        System.out.println("Smart Washing Machine Can Controlled through Mobile");
    }
    public static void main(String[] args){
        SmartWashingMachine WM = new SmartWashingMachine();
        SmartRefrigerator RF = new SmartRefrigerator(); 
        WM.start();
        WM.controlRemotely();

        RF.start();
        RF.controlRemotely();
    }
}
