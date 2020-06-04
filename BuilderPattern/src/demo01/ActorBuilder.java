package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/6/4
 * \* Time: 10:23
 * \* Description: www.diandian.在线
 * \* 功能说明：抽象建造者
 * \
 */
public abstract class ActorBuilder extends Actor{
    protected Actor actor=new Actor() ;

    public void buildType(){

    }
    public void buildSex(){

    }
    public void buildFace(){

    }
    public void buildCostume(){

    }
    public void buildHairsytle(){

    }
    Actor createActor(){
        return actor;
    }
}