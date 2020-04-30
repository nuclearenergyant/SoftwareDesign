package demo01;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 9:21
 * \* Description: www.diandian.在线
 * \
 */

/*目标*/
public abstract class SubjectPlayer {
    protected ArrayList observers=new ArrayList();
    public abstract void add(Ally ally);
    public abstract void del(Ally ally);
    public abstract void attacked();
}