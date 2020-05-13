package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/13
 * \* Time: 15:43
 * \* Description: www.diandian.在线
 * \* 功能说明：主任，审批金额少于5万
 * \
 */
public class Director extends Approver{
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()*request.getNumber()<50000){
            System.out.println("主任"+name+
                    " 审批通过了" +
                    " 数量为"+request.getNumber()+
                    " 单价金额为："+request.getAmount()+
                    " 总金额为:"+request.getNumber()*request.getAmount()+
                    " 其用途为:" + request.getPurpose());
        }
        else {
            if (this.successor!=null){
                this.successor.processRequest(request);
            }
        }
    }
}