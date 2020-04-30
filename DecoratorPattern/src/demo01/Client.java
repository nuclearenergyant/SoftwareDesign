package demo01;

public class Client {
    public static void main(String[] args) {
        System.out.println("你好");
        //第一代产品的手机（简单的手机）有声音提醒
        SimplePhone simplePhone=new SimplePhone();
        simplePhone.call();
        simplePhone.ring();
        System.out.println("--------");

        //第二代手机，除了有声音提醒，还有振动提示。
        JarPhone jarPhone=new JarPhone();
        jarPhone.call();
        jarPhone.ring();
        jarPhone.shock();
        System.out.println("--------");


        //第三代手机，来电时，不仅能够发声，振动，还有灯光闪烁提示。
        ComplexPhone complexPhone=new ComplexPhone();
        complexPhone.call();
        complexPhone.ring();
        complexPhone.shock();
        complexPhone.flashing_lights();
    }
}
