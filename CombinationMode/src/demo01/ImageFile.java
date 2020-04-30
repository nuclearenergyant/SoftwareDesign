package demo01;

public class ImageFile extends AbstractFile {
    private String fileName;
    public ImageFile(String fileName){
        this.fileName=fileName;
        System.out.println("创建图片文件"+fileName);
    }

    @Override
    public void add(AbstractFile element) {
        System.out.println("demo01.ImageFile:add");
    }

    @Override
    public void remove(AbstractFile element) {

        System.out.println("demo01.ImageFile:remove");
    }

    @Override
    public void display() {
        System.out.println(fileName+"----》显示");
    }
}
