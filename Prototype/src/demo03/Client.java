package demo03;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer,copyCustomer;
        customer=new Customer("广东");
        copyCustomer= (Customer) customer.clone();

        System.out.println("复制成功");
        System.out.println("比较浅克隆后两个对象是否相同");
        System.out.println(copyCustomer==customer);

        System.out.println("修改copyCustomer引用类型Addreas中的idea属性");
        copyCustomer.setidea("广西");
        System.out.println("分别输出原型对象和克隆对象的引用类型Addreas中的idea属性");
        System.out.println(customer.getAddress().getIdea());
        System.out.println(copyCustomer.getAddress().getIdea());
    }
}
