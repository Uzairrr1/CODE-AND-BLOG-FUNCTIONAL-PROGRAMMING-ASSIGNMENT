package OpenClose;

public class User {
    int userId;
    String name;
    String address;
    int contactNumber;
    public int getUserId()
    {return this.userId;}
    public String getName()
    {return this.name;}
    public String getAddress()
    {return this.address;}
    public int getContactNumber()
    {return this.contactNumber;}
    public void setUserId(int userId)
    {this.userId=userId;}
    public void setName(String name)
    {this.name=name;}
    public void setAddress(String address)
    {this.address=address;}
    public void setContactNumber(int contactNumber)
    {this.contactNumber=contactNumber;}
    User(){
        setUserId(1234);
        setName("Uzair");
        setAddress("lakhimpur-kheri");
        setContactNumber(123456789);
    }
}
