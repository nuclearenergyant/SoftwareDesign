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
public class HeroBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("铠甲");
    }

    @Override
    public void buildHairsytle() {
        actor.setHairsytle("飘逸的头发");
    }
}