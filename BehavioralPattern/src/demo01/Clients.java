package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/13
 * \* Time: 16:04
 * \* Description: www.diandian.在线
 * \* 功能说明：主函数
 * \
 */
public class Clients {
    public static void main(String[] args) {
        //新建主管人员职责链表
        Approver objDirector,objVicPresident,objPresident,objCongress;

        objDirector = new Director("王明");
        objVicPresident =new VicePresident("赵强");
        objPresident =new President("萧红");
        objCongress = new Congress("张三、李四、赵六");

        //编辑所属单位关系
        objDirector.setSuccessor(objVicPresident);
        objVicPresident.setSuccessor(objPresident);
        objPresident.setSuccessor(objCongress);

        //新建一个采购单
        PurchaseRequest purchaseRequest=new PurchaseRequest(50000,2,
                "采购云服务器");
        //开始审核
        objDirector.processRequest(purchaseRequest);
    }
}