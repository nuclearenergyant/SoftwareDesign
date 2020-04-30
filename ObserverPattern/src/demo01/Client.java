package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 9:38
 * \* Description: www.diandian.在线
 * \
 */
public class Client {
    public static void main(String[] args) {
        SubjectPlayer subjectPlayer=new Headquarters("本地玩家");
        Ally ally =new DemoAlly("核能蚂蚁");
        //添加玩家
        subjectPlayer.add(ally);
        //盟友被袭击
        subjectPlayer.attacked();
    }
}