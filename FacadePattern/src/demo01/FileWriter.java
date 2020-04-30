package demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String encryptText,String fileNameDes) {
        System.out.println("加密，并保存到目的文件："+fileNameDes);



        try {
            //创建文件(判断是否文件存在)
            File file=new File(fileNameDes);

            if(!file.exists())
                file.createNewFile();
            else
                System.out.println("文件已存在，无需创建");

            //写文件
            byte bt[] = new byte[1024];
            bt = encryptText.getBytes();
            FileOutputStream in = new FileOutputStream(file);
            try {
                in.write(bt, 0, bt.length);
                in.close();

                 System.out.println("写入文件成功");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
