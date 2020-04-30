package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/23
 * \* Time: 9:57
 * \* Description: www.diandian.在线
 * \
 */
public class FunctionButton {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.println("点击了按钮");
        command.execute();
    }
}