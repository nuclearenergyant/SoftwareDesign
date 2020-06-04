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
public class DevilBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildFace() {
        actor.setFace("美丽");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("刺眼的黑衣");
    }

    @Override
    public void buildHairsytle() {
        actor.setHairsytle("光头");
    }
}