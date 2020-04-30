package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 21:15
 * \* Description: www.diandian.在线
 * \
 */
abstract class AbstractProductVector {
    //抽象商品向量
    private String[] productName;

    public AbstractProductVector(String[] produceName) {
        this.productName = produceName;
    }


    public String[] getProductsName(){
        return this.productName;
    }
    public abstract AbstractIterator getIterator();
}