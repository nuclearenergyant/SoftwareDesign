package demo01;

import java.io.File;
import java.io.FileInputStream;

//读文件类
public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("打开文件夹，获取源文件："+fileNameSrc);
        String str="";
        try {
            int length=0;

            byte buffer[] = new byte[100];
            File file=new File(fileNameSrc);
            FileInputStream inputStream=new FileInputStream(file);
            while((length=inputStream.read(buffer,0,buffer.length))!=-1){
                str+=new String(buffer,0,length);
            }
            System.out.println("加密前:"+str);
            System.out.println("===========");
            //关闭输入流
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        return str;
    }
}
