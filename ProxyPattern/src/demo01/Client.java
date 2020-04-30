package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/22
 * \* Time: 19:08
 * \* Description: www.diandian.在线
 * \
 */
public class Client {
    public static void main(String[] args) {

//        BusinessClass businessClass=new BusinessClass();
//        businessClass.method();
        LoggerProxy loggerProxy=new LoggerProxy();
        loggerProxy.method();
    }
}