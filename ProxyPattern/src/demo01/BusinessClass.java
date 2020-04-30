package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/22
 * \* Time: 19:00
 * \* Description: www.diandian.在线
 * \
 */


public class BusinessClass implements AbstractSubject{

    //业务方法
    @Override
    public void method() {
        try{
            //LoggerProxy l=new LoggerProxy();
            //System.out.println("方法method()被调用，调用时间为2017-11-05  10:10:10");
            System.out.println("方法method()调用成功");
        }catch (Exception e){
            System.out.println("方法method()调用失败");
        }
    }
}