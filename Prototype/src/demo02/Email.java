package demo02;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment=null;
    private String emailTitle;
    private int emailLevel;

    //有参数构造方法
    public Email(String emailTitle,int emailLevel,String desc){
        this.attachment=new Attachment();
        this.emailTitle=emailTitle;
        this.emailLevel=emailLevel;
        this.attachment.setDesc(desc);
    }

    public Email(){
        this.attachment=new Attachment();
    }
    public Object deepClone() throws Exception{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        // 将流序列化成对象
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (ois.readObject());
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public int getEmailLevel() {
        return emailLevel;
    }

    public void setEmailLevel(int emailLevel) {
        this.emailLevel = emailLevel;
    }

    public void setDesc(String desc) {
        this.attachment.setDesc(desc);
    }
    public void display(){
        System.out.println("查看邮箱");
    }
}
