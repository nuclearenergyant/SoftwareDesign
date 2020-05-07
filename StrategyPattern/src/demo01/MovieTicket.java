package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/7
 * \* Time: 9:34
 * \* Description: www.diandian.在线
 * \
 */

/*售票系统*/
public class MovieTicket {
    private double price;
    /** 维持一个对抽象折扣类的引用 */
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 注入一个折扣类对象
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}