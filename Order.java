import java.util.ArrayList;//needed to use ArrayList

public class Order
{
    private ArrayList<String> itemsInOrder = new ArrayList<String>();
    private Customer customer;
    private ShoppingCart cart;
    //private Address shippingAddress;
    private String fName,surName,emailAddress, paid;
    
    public Order(Customer customer, ShoppingCart cart)
    {
        this.customer = customer;
        this.cart = cart;
        getItemsFromArray();
    }
    
    public void getItemsFromArray()
    {
        itemsInOrder = cart.orderArray();
        
        System.out.println("\t Items Currently in Order");//prints
        for (int i = 0; i < itemsInOrder.size(); i++){
            System.out.println(itemsInOrder.get(i));//prints items in order
        }
    }
    
    public void getCustomerInfo()
    {
        this.fName = customer.getfirstName();//gets customer first name
        this.surName = customer.getsurName();//surname
        this.emailAddress = customer.getEmail();//email
    }
    
    public String sendConfirmationEmail()
    {
        return emailAddress;   //returns email
    }
    
    public void printOrder()
    {
      System.out.println("Customer Name: "+customer.getfirstName()+" "+customer.getsurName());// prints the customers name 
      System.out.println("Customer Id: " +customer.getId());//prints customerid
      System.out.println("Cart Id: " +cart.getCartId());//prints cartid
    }
}
