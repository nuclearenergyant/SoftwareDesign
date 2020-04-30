package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 10:36
 * \* Description: www.diandian.在线
 * \
 */
public interface Observer {
    public String getName() ;
    public void setName(String name) ;
    public void help();
    public void beAttacked(AllyControlCenter acc);
}