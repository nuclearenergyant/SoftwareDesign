package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 21:16
 * \* Description: www.diandian.在线
 * \
 */
public class ProductVector extends AbstractProductVector{
    public ProductVector(String[] produceName){
        super(produceName);
    }
    @Override
    public AbstractIterator getIterator() {
        //返回迭代器
        return new MyIterator(this);
    }

}