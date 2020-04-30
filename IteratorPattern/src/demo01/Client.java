package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 20:25
 * \* Description: www.diandian.在线
 * \
 */
public class Client {

    //向后遍历
    public static void process(CommodityManagementSystem cms){
        Iterator i=cms.creatIterator();


    }
    public static void main(String[] args) {
        CommodityManagementSystem cms=new CommodityManagementSystem();
        Iterator iterator=cms.creatIterator();

        iterator.next();

        //iterator.setItem(2);
        //System.out.println(iterator.Item());

        System.out.println("--------");
        iterator.forward();
    }
}