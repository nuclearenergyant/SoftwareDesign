package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/13
 * \* Time: 15:56
 * \* Description: www.diandian.在线
 * \* 功能说明：副董事长，审批金额少于10万
 * \
 */
public class VicePresident extends Approver{
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()*request.getNumber()<100000){
            System.out.println("副董事长"+name+
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