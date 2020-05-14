package demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/14
 * \* Time: 10:46
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
public class Clients {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<Account>();
        //模拟数据库，且添加数据
        accounts.add(new CurrentAccount("admin01","123456"));
        accounts.add(new SavingAccount("admin02","567890"));

        //现在开始验证客户信息
        Account account= new SavingAccount("admin02","567890");
        account.setAccounts(accounts);
        account.calculateInterest();
    }
}