package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/13
 * \* Time: 15:35
 * \* Description: www.diandian.在线
 * \* 抽象批准人
 */
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor){
        this.successor=successor;
    }
    public void processRequest(PurchaseRequest request){

    }
}