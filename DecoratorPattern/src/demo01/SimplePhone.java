package demo01;

public class SimplePhone implements Phone{
    public void ring(){
        System.out.println("发出声音提醒");
    }

    @Override
    public void call() {
        System.out.println("来电，提醒接听电话");
    }
}
