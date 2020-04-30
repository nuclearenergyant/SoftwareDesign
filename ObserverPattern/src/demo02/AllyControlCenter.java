package demo02;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 10:38
 * \* Description: www.diandian.在线
 * \
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList players=new ArrayList();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    public void join(Player player) {
        setAllyName(this.allyName);
        players.add(player);
        System.out.println(getAllyName()+":添加玩家 "+player.getName());
    }


    public void quit(Player player) {
        setAllyName(player.getName());
        players.remove(player);
        System.out.println(getAllyName()+"删除玩家"+player.getName());
    }

    //通知盟友
    public void notifyObserver(String allyName){

    }
}