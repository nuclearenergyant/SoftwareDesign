package demo01;

public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade=new EncryptFacade();
        encryptFacade.fileEncrypt("E:\\test.txt","E:\\save.txt");
    }
}
