package factory;


import airProduce.TCLAir;
import tvproduce.TclTV;
import in.AirConditioner;
import in.EFactory;
import in.Televison;

public class TCLFactory implements EFactory {
    @Override
    public Televison produceTelevision() {
        return new TclTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAir();
    }
}
