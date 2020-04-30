package demo03;

public class Customer implements Cloneable{
    private Address address;



    public Customer(String idea){
        this.address=new Address();
        this.address.setIdea(idea);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public void setidea(String idea) {
        this.address.setIdea(idea);
    }
    public Address getAddress() {
        return address;
    }
}
