package demo02;

import java.io.Serializable;

public class Attachment implements Serializable {
    private String desc;
    public void download(){
        System.out.println("下载附件");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
