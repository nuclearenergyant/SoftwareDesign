package demo01;

public class Email implements Cloneable {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        System.out.println("查看邮箱");
    }

    public int getEmailLevel() {
        return emailLevel;
    }

    public void setEmailLevel(int emailLevel) {
        this.emailLevel = emailLevel;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }


    public void setDesc(String desc) {
        this.attachment.setDesc(desc);
    }
}
