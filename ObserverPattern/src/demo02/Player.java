package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 10:41
 * \* Description: www.diandian.在线
 * \
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void help() {
        System.out.println(name+" 盟友帮助");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name+" 遇袭");
        //请求帮助
        acc.notifyObserver(name);
    }

}