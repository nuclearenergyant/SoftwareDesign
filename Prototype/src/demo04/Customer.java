package demo04;

public class Customer implements Cloneable{
    private Address address;



    public Customer(String idea){
        this.address=new Address();
        this.address.setIdea(idea);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer customer= (Customer) super.clone();
        customer.address= (Address) address.clone();
        return customer;
    }


    public void setidea(String idea) {
        this.address.setIdea(idea);
    }

    public Address getAddress() {
        return address;
    }
}
