package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 21:11
 * \* Description: www.diandian.在线
 * \
 */
public interface AbstractIterator {
    //迭代器接口
    public void next();//向后
    public boolean isLast();//最后一个
    public void previous();//向前
    public boolean isFirst();//最前一个
    public String getNextItem();//下一个
    public String getPreviousItem();//上一个
    public String getCurrentItem();//当前
}