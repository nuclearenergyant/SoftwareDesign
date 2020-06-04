package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/4
 * \* Time: 10:47
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class Cilent {

    public static void main(String[] args) {
        ActorBuilder actorBuilder= (ActorBuilder) XMLUtil.getidea();

        ActorController actorController=new ActorController();


        Actor actor= actorController.coustruct(actorBuilder);
        System.out.println("角色："+actor.getType());
        System.out.println("性别："+actor.getSex());
        System.out.println("面容："+actor.getFace());
        System.out.println("服饰："+actor.getCostume());
        System.out.println("发型："+actor.getHairsytle());
    }
}