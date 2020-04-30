package demo01;

public class EncryptFacade {
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {
        fileReader=new FileReader();
        cipherMachine=new CipherMachine();
        fileWriter=new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        //获取文件
        String plainStr=fileReader.read(fileNameSrc);
        //加密
        String encryptStr=cipherMachine.encrypt(plainStr);
        System.out.println("加密后:"+encryptStr);
        System.out.println("===========");
        //写文件
        fileWriter.write(encryptStr,fileNameDes);
    }
}
