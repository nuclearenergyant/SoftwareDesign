package demo01.adpter;

import demo01.adaptee.AirAdaptee;
import demo01.adaptee.FridgeAdaptee;
import demo01.adaptee.TVAdaptee;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/15
 * \* Time: 12:48
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public interface ProduceAdapter {
    public TVAdaptee produceTV();
    public AirAdaptee produceAir();
    public FridgeAdaptee produceFridge();
}