package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/13
 * \* Time: 16:00
 * \* Description: www.diandian.在线
 * \* 功能说明：董事会，审批金额大于50万
 * \
 */
public class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()*request.getNumber()>=500000){
            System.out.println("董事会"+name+
                    " 审批通过了" +
                    " 数量为"+request.getNumber()+
                    " 单价金额为："+request.getAmount()+
                    " 总金额为:"+request.getNumber()*request.getAmount()+
                    " 其用途为:" + request.getPurpose());
        }
        else {
            System.out.println("董事会，审批了数量为"+name+
                    "数量为"+request.getNumber()+
                    " 单价金额为："+request.getAmount()+
                    "总金额为:"+request.getNumber()*request.getAmount()+
                    " 其用途为:" + request.getPurpose() +
                    "的结果失败，审批不通过");
        }
    }
}