package demo01;

import demo01.air.HisenseAirConditioner;
import demo01.factory.Factory;
import demo01.factory.HaierFactory;
import demo01.factory.HisenseFactory;
import demo01.fri.HisenseFridge;
import demo01.tv.HisenseTelevision;
import demo01.util.XMLUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/15
 * \* Time: 13:08
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class Clients {
    public static void main(String[] args) {
        //新建工厂
        HisenseFactory factory= (HisenseFactory) XMLUtil.getidea();
        HisenseTelevision television= (HisenseTelevision) factory.produceTV();
        HisenseFridge fridge= (HisenseFridge) factory.produceFridge();
        HisenseAirConditioner airConditioner= (HisenseAirConditioner) factory.produceAir();

        television.play();
        airConditioner.play();
        fridge.play();
    }
}