package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/23
 * \* Time: 10:07
 * \* Description: www.diandian.在线
 * \
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton button=new FunctionButton();

        button.setCommand((Command) XMLUtil.getidea());
        button.click();
    }
}