package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 9:22
 * \* Description: www.diandian.在线
 * \
 */

//*具体目标-指挥部*/
public class Headquarters extends SubjectPlayer{
    private String name;

    public Headquarters(String name) {
        this.name = name;
    }

    @Override
    public void add(Ally ally) {
        observers.add(ally);
        System.out.println("添加玩家");
    }

    @Override
    public void del(Ally ally) {
        observers.remove(ally);
        System.out.println("删除玩家");
    }

    @Override
    public void attacked() {
        System.out.println(name+"——》遇袭");
        for (Object obs: observers){
            ((Ally)obs).log();
            ((Ally)obs).help();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}