package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/22
 * \* Time: 18:59
 * \* Description: www.diandian.在线
 * \
 */
public class LoggerProxy implements AbstractSubject {
    private BusinessClass businessClass=new BusinessClass();

    //日志的方法
    public void method(){

        System.out.println("方法method()被调用，调用时间为2017-11-05  10:10:10");
        businessClass.method();
    }
}