package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 21:12
 * \* Description: www.diandian.在线
 * \
 */
public class MyIterator implements AbstractIterator{
    //商品类迭代器
    private String[] productName;
    private int index;

    public MyIterator(AbstractProductVector ve) {
        // 用商品类来初始化构造函数
        productName = ve.getProductsName();
        index = 0;
    }

    public void next() {
        // TODO Auto-generated method stub
        index=(index+1)%productName.length;
    }

    public boolean isLast() {
        // TODO Auto-generated method stub
        return (index == productName.length-1);
    }

    public void previous() {
        // TODO Auto-generated method stub
        index=(index-1)%productName.length;
    }

    public boolean isFirst() {
        // TODO Auto-generated method stub
        return index==0;
    }


    public String getNextItem() {
        return productName[(index+1)%productName.length];
    }

    public String getPreviousItem() {
        // TODO Auto-generated method stub
        return productName[index];
    }
    public String getCurrentItem() {
        return productName[index];
    }


}