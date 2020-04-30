package demo01;

public class Client {


    public static void main(String[] args) throws Exception {
        //浅克隆
        Email email;
        Email copyEmail;
        email=new Email("中国",1,"第一");

        copyEmail= (Email) email.clone();
        System.out.println("复制成功");
        System.out.println("判断想在原型对象和克隆对象是否形同：");
        System.out.println(email==copyEmail);
        System.out.println();

        System.out.println("判断原型对象和克隆对象引用类型是否相同");
        System.out.println(email.getAttachment().equals(copyEmail.getAttachment()));
        System.out.println();

        System.out.println("复制成功后，判断原型对象和克隆对象的成员属性emailTitle的值是否相同");
        System.out.println(email.getEmailTitle().equals(copyEmail.getEmailTitle()));
        System.out.println();

        //修改后的Email的标题
        System.out.println("修改后的Email的标题，判断原型对象和克隆对象的成员属性的值是否相同");
        copyEmail.setEmailTitle("巴基斯坦");
        System.out.println(email.getEmailTitle().equals(copyEmail.getEmailTitle()));
        System.out.println();


        //修改后的Email附件
        copyEmail.setDesc("第二");
        System.out.println("判断修改后，原型对象和克隆对象引用类型是否相同");
        System.out.println(copyEmail.getAttachment().getDesc().equals(email.getAttachment().getDesc()));

        System.out.println("第二次上传");

        /*
        *
        * 浅克隆:
        * 1.如果原型对象的成员变量是值类型，将复制一份给克隆对象，也就是说在堆中拥有独立的空间；
        * 2.如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。
        * */

    }

}
