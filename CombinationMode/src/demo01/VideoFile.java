package demo01;

public class VideoFile extends AbstractFile {
    private String fileName;
    public  VideoFile(String fileName){
        this.fileName=fileName;
        System.out.println("创建视频文件"+fileName);

    }

    @Override
    public void remove(AbstractFile element) {
        System.out.println("demo01.VideoFile:remove");
    }

    @Override
    public void add(AbstractFile element) {
        System.out.println("demo01.VideoFile:add");
    }

    @Override
    public void display() {
        System.out.println(fileName+"----》显示");
    }
}
