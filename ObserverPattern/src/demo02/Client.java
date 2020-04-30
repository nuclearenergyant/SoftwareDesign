package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 11:05
 * \* Description: www.diandian.在线
 * \
 */
public class Client {
    public static void main(String[] args) {
        Player observer01=new Player("玩家01");
        Player observer02=new Player("玩家02");
        Player observer03=new Player("玩家03");
        ConcreteAllControlCenter concreteAllControlCenter=
                new ConcreteAllControlCenter("外星人游戏控制台");

        //添加玩家
        concreteAllControlCenter.join(observer01);
        concreteAllControlCenter.join(observer02);
        concreteAllControlCenter.join(observer03);
        System.out.println("_____________");
        //遇袭请求帮助
        observer01.beAttacked(concreteAllControlCenter);
    }
}