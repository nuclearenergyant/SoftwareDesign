package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/4
 * \* Time: 10:22
 * \* Description: www.diandian.在线
 * \* 功能说明：指挥者
 * \
 */
public class ActorController {

    private ActorBuilder actorBuilder;

    Actor coustruct(ActorBuilder actorBuilder){
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairsytle();
        return actorBuilder.createActor();
    }
}