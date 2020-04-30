package demo01;

public class Client {
    public static void main(String[] args) {
        AbstractFile obj01,obj02,obj03,onj04,obj05;
        Folder folder01,folder02,folder03;

        obj01=new TextFile("text文件01");
        obj02=new VideoFile("video文件01");
        obj03=new VideoFile("video文件02");
        onj04=new ImageFile("Image文件01");
        obj05=new ImageFile("Image文件02");

        folder01=new Folder("文件夹A");
        folder02=new Folder("文件夹B");
        folder03=new Folder("文件夹C");

        folder01.add(obj01);
        folder01.add(folder02);
        folder01.display();

        folder02.add(obj02);
        folder02.add(obj03);
        folder02.add(folder03);
        folder02.display();

        folder03.add(onj04);
        folder03.add(obj05);
        folder03.display();

    }
}
