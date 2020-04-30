package demo02;

public class Client {
    public static void main(String[] args) {
        /*
         * 深拷贝有两种方式:
         * 1.一种是跟浅拷贝一样实现 Cloneable 接口
         * 2.另一种是实现 Serializable 接口，用序列化的方式来实现深拷贝
         * */
        Email email02;
        Email copyEmail02=null;
        email02=new Email("中国",1,"第一");

        try {
            copyEmail02=(Email)email02.deepClone();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("复制成功");
        System.out.println("判断想在原型对象和克隆对象是否形同");
        System.out.println(email02== copyEmail02);
        System.out.println();

        System.out.println("判断原型对象和克隆对象引用类型是否相同");
        System.out.println(email02.getAttachment().equals(copyEmail02.getAttachment()));
        System.out.println();

        System.out.println("复制成功后，判断原型对象和克隆对象的成员属性emailTitle的值是否相同");
        System.out.println(email02.getEmailTitle().equals(copyEmail02.getEmailTitle()));
        System.out.println();

        //修改后的Email的标题
        System.out.println("修改后的Email的标题，判断原型对象和克隆对象的成员属性的值是否相同");
        copyEmail02.setEmailTitle("巴基斯坦");
        System.out.println(email02.getEmailTitle().equals(copyEmail02.getEmailTitle()));
        System.out.println();


        //修改后的Email附件
        copyEmail02.setDesc("第二");
        System.out.println("判断修改后，原型对象和克隆对象引用类型是否相同");
        System.out.println(copyEmail02.getAttachment().getDesc().equals(email02.getAttachment().getDesc()));
        /*
        * 深拷贝是一种完全拷贝，无论是值类型还是引用类型都会完完全全的拷贝一份
        * 在内存中生成一个新的对象
        * 简单点说就是拷贝对象和被拷贝对象没有任何关系，互不影响
        * */
    }
}
