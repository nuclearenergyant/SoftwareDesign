package demo02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/30
 * \* Time: 10:54
 * \* Description: www.diandian.在线
 * \
 */
public class ConcreteAllControlCenter extends AllyControlCenter{

    //构造方法
    public ConcreteAllControlCenter(String allyName) {
        this.allyName=allyName;
    }

    //通知盟友
    @Override
    public void notifyObserver(String allyName) {
        System.out.println(allyName+" 通知盟友");
        for (Object o:players){
            //排除自己的其他盟友
            if (!((Observer)o).getName().equalsIgnoreCase(allyName)){
                ((Observer)o).help();
            }
        }
    }
}