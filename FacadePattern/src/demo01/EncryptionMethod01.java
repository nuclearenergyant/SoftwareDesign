package demo01;

public class EncryptionMethod01 extends Encryption{
    @Override
    public String change(String plainText) {
        //第一种加密
        System.out.println("选择第一种加密方式");
        String str= "";

        for (int i=plainText.length();i>0;i--){

            str+=plainText.substring(i-1,i);
        }
        return str;
    }
}
