package demo01;

public class EncryptionMethod02 extends Encryption{
    @Override
    public String change(String plainText) {
        System.out.println("选择第二种加密方式");
        //第二种
        String str = "";
        char charTemp;
        int intCrpytion;
        int intRnd;
        intRnd = 37;// (int)(100*Math.random()+1);
        StringBuffer strOriToB = new StringBuffer(plainText);

        strOriToB = strOriToB.reverse();
        for (int i = 0; i < strOriToB.length(); i++) {
            charTemp = strOriToB.charAt(i);
            intCrpytion = (int) charTemp;
            intCrpytion = intCrpytion ^ (intRnd % 32);
            str += (char) intCrpytion;
        }
        str = str + (char) intRnd;

        // 返回加密后的字符串
        return str;
    }
}
