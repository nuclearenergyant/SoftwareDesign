package demo01;
//实现加密类
public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("加密读取到的文件");
        String result=reverse(plainText);
        return new String(result);
    }

    private String reverse(String plainText) {
       /* //第一种加密
        String str= "";

        for (int i=plainText.length();i>0;i--){

            //str+=plainText.substring(i-1,i);
        }

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
        return str;*/

        
        Encryption encryption=(Encryption) XMLUtil.getidea();
        return encryption.change(plainText);
    }
}
