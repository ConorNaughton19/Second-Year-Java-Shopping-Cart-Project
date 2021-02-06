public class email
{
    private String email;
    private Order order;
    private Payment payment;
    private Customer customer;
    
    public email(Order order, Customer customer, Payment payment)
    {
       this.payment = payment;
       this.customer = customer;
       this.order = order;
    }
    
    public void getEmail()
    {
        boolean ge = payment.verify();
        if(ge == true)
        {//this prints if the payment test is passed
            System.out.println("Your  order has now been placed, thank you " + customer.getfirstName() + " "+ customer.getsurName());
            System.out.println("Email Confirmation sent to "+customer.getEmail()+ "\n");
        }
        else
        {//this prints if the payment test is failed(card is denied)
            System.out.println("Your order wasn't placed, You're card was declined.");
            System.out.println("Apologies for the inconvinence " +customer.getfirstName() + " "+ customer.getsurName());
            System.out.println("Email confirmation of failed transaction to be sent to "+customer.getEmail()+"\n");
        }
    }
    
    public void sendConfirmEmail()
    {
          customer.getEmail();
    }
}