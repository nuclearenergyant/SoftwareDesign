package demo04;

public class Address implements Cloneable{
    //idea包含了所有信息，此处做简化
    private String idea;

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
