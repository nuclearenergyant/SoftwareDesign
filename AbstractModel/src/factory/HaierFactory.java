package factory;


import airProduce.HaierAir;
import tvproduce.HaierTV;
import in.EFactory;
import in.AirConditioner;
import in.Televison;

public class HaierFactory implements EFactory {
    @Override
    public Televison produceTelevision() {
        return new HaierTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAir();
    }
}
