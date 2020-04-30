package demo01;

public class TextFile extends AbstractFile {
    private String fileName;
    public TextFile(String fileName){
        this.fileName=fileName;
        System.out.println("创建文本文件"+fileName);
    }

    @Override
    public void add(AbstractFile element) {
        System.out.println("demo01.TextFile:add");
    }

    @Override
    public void remove(AbstractFile element) {

        System.out.println("demo01.TextFile:remove");
    }

    @Override
    public void display() {
        //System.out.println(fileName);
        System.out.println(fileName+"----》显示");
    }
}
