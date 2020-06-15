package demo01.fri;

import demo01.adaptee.AirAdaptee;
import demo01.adaptee.FridgeAdaptee;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/15
 * \* Time: 12:39
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class HisenseFridge extends FridgeAdaptee {
    public void play(){
        System.out.println("海信冰箱");
    }
}