package client;

import in.AirConditioner;
import in.EFactory;
import in.Televison;
import util.XMLUtil;

public class Clients {

    public static void main(String[] args) {
        EFactory factory;
        Televison televison;
        AirConditioner airConditioner;
        factory=(EFactory) XMLUtil.getidea();

        assert factory != null;
        televison=factory.produceTelevision();
        airConditioner=factory.produceAirConditioner();
        airConditioner.changeTemperature();
        televison.play();
    }
}
