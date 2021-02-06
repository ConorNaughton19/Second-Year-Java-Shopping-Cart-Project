import java.util.Random;
public class Customer
{
    // instance variables
    private String firstName;
    private String surName;
    private String emailAddress;
    private final long customerId;
    private ShoppingCart cart;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String firstName, String surName, String emailAddress)
    {
        // initialise instance variables
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId = makeCustomerId();
    }

    public long makeCustomerId(){
        Random rand = new Random();
        return rand.nextInt(100000000);//creates a random id for the customerId
    }
    
    public long getId()
    {
        return customerId;//getsId
    }
    
    public String getfirstName()
    {
        return firstName;//getsFname
    }
    
    public String getsurName()
    {
        return surName;//getsLname
    }
    
    public String getEmail()
    {
        return emailAddress;//getsEmail
    }

}
