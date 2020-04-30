package demo01;

public class Attachment {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void download(){
        System.out.println("下载附件");
    }

}
