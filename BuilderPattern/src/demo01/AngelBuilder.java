package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/4
 * \* Time: 10:36
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class AngelBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildFace() {
        actor.setFace("美丽");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairsytle() {
        actor.setHairsytle("披肩的头发");
    }
}