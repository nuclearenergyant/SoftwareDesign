package demo01;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private ArrayList fileList=new ArrayList();
    private String fileName;
    public Folder(String fileName){
        this.fileName=fileName;
        System.out.println("创建文件夹"+fileName);
    }

    @Override
    public void add(AbstractFile element) {
        fileList.add(element);
        System.out.println("demo01.Folder:add");
    }

    @Override
    public void remove(AbstractFile element) {
        fileList.remove(element);
        System.out.println("demo01.Folder:remove");

    }

    @Override
    public void display() {
        for(Object object:fileList)
        {
            ((AbstractFile)object).display();
        }
        System.out.println(fileName+"文件夹-->显示");
    }
}
