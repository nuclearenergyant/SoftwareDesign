package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 9:36
 * \* Description: www.diandian.在线
 * \
 */

/*具体观察者*/
public class DemoAlly implements Ally{

    //玩家的账号名
    private String name;

    public DemoAlly(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(name+"盟友——》做出反应");
    }

    @Override
    public void log() {
        System.out.println("通知信息->"+getName());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}