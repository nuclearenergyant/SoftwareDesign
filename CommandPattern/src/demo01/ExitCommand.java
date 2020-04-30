package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/23
 * \* Time: 9:57
 * \* Description: www.diandian.在线
 * \
 */
public class ExitCommand extends Command{
    private SystemExitClass seObj=new SystemExitClass();

    @Override
    public void execute() {
        seObj.exit();
    }
}