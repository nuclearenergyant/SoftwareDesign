package demo01.factory;

import demo01.adaptee.AirAdaptee;
import demo01.adaptee.FridgeAdaptee;
import demo01.adaptee.TVAdaptee;
import demo01.adpter.ProduceAdapter;
import demo01.air.HaierAirConditioner;
import demo01.fri.HaierFridge;
import demo01.tv.HaierTelevision;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/15
 * \* Time: 12:36
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class HaierFactory extends Factory implements ProduceAdapter {

    @Override
    public TVAdaptee produceTV() {
        return new HaierTelevision();
    }

    @Override
    public AirAdaptee produceAir() {
        return new HaierAirConditioner();
    }

    @Override
    public FridgeAdaptee produceFridge() {
        return new HaierFridge();
    }
}