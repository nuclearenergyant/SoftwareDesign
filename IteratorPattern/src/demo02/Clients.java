package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 21:19
 * \* Description: www.diandian.在线
 * \
 */
public class Clients {
    public static void main(String[] args) {

        String[] productName={"上衣","裤子","裙子","帽子","手表","鞋子"};
        ProductVector productVector=new ProductVector(productName);
        //实例化迭代器
        AbstractIterator iterator= productVector.getIterator();


        //测试读取当前数据
        //System.out.println(iterator.getCurrentItem());

        for (int i=0;i<productName.length;i++){
            System.out.println(iterator.getNextItem());
        }
    }
}