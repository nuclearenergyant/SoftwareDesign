package demo01;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/14
 * \* Time: 10:31
 * \* Description: www.diandian.在线
 * \* 功能说明：抽象账号类
 * \
 */
public abstract class Account {
    private List<Account> accounts=null;
    private String account;
    private String password;
    private int i;

    public Account(String account, String password) {
        this.account = account;
        this.password = password;
    }

    //验证
    public boolean validate(String account,String password){
        for (Account account1:accounts){
            if (account1.getAccount()== account && account1.getPassword()==password){
                return true;
            }
        }
        return false;
    }
    //计算利息
    public void calculateInterest(){
        //验证
        if (validate(this.account,this.password)){
            System.out.println("验证成功");
            handle(this.account,this.password);
            //显示利息
            display();
        }
        else
            System.out.println("验证失败");
    }
    //显示利息信息
    public void display(){

        if (i==1) {
            System.out.println("您的年利息为4.5%");
        }
        if (i==2){
            System.out.println("您的年利息为7.5%");
        }

    }
    //处理
    public void handle(String account,String password){
        for (Account account1:accounts){
            System.out.println("处理中....");
            if (account1.getAccount().equals(account) && account1.getPassword().equals(password)){
                System.out.println("该账号类型为："+account1.getClass().getSimpleName());
                if (account1.getClass().getSimpleName().equals("SavingAccount")){
                    i=2;
                }
                if (account1.getClass().getSimpleName().equals("CurrentAccount")){
                    i=1;
                }
                break;
            }
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}