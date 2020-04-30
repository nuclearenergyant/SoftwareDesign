package airProduce;

import in.AirConditioner;

public class TCLAir implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调改变温度");
    }
}
