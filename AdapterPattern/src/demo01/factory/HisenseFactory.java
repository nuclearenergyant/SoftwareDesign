package demo01.factory;

import demo01.adaptee.AirAdaptee;
import demo01.adaptee.FridgeAdaptee;
import demo01.adaptee.TVAdaptee;
import demo01.adpter.ProduceAdapter;
import demo01.air.HisenseAirConditioner;
import demo01.fri.HisenseFridge;
import demo01.tv.HaierTelevision;
import demo01.tv.HisenseTelevision;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/15
 * \* Time: 12:37
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class HisenseFactory extends Factory implements ProduceAdapter {
    @Override
    public TVAdaptee produceTV() {
        return new HisenseTelevision();
    }

    @Override
    public AirAdaptee produceAir() {
        return new HisenseAirConditioner();
    }

    @Override
    public FridgeAdaptee produceFridge() {
        return new HisenseFridge();
    }
}