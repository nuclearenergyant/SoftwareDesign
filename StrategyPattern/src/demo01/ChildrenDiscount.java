package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/7
 * \* Time: 10:32
 * \* Description: www.diandian.在线
 * \
 */
public class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        if (price<=20){
            System.out.println("对不起，儿童减免优惠需满足票价高于20元");
            return 0;
        }
        System.out.println("儿童票：");
        return price - 10;
    }
}