package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/23
 * \* Time: 10:01
 * \* Description: www.diandian.在线
 * \
 */
public class HelpCommand extends Command{

    private DisplayhelpClass hcObj=new DisplayhelpClass();

    @Override
    public void execute() {
        hcObj.display();
    }
}