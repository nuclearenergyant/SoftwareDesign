package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/7
 * \* Time: 10:36
 * \* Description: www.diandian.在线
 * \
 */
public class Client {
    public static void main(String[] args) {
        double originalPrice = 29.0;
        double currentPrice;

        MovieTicket mt = new MovieTicket();
        mt.setPrice(originalPrice);

        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        Discount discount = (Discount) XMLUtil.getidea();
        mt.setDiscount(discount); //注入折扣对象
        currentPrice = mt.getPrice();
        if (currentPrice==0){
            System.out.println("购票失败");
        }else {
            System.out.println("折后价为：" + currentPrice);
        }

    }
}