package airProduce;

import in.AirConditioner;

public class HaierAir implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("Haier空调改变温度");
    }
}
