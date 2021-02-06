public class TransactionTest
{

public static void main(String[] args)
{
    TransactionTest test = new TransactionTest();
    test.transaction1();//scenario 1
    test.transaction2();//scenario 2
}

public void transaction1(){
    //the body of our code for the first scenario will go here
    Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");//set details of the customer such as Email and Name 
    
    ShoppingCart cart = new ShoppingCart(customer);//shopping cart gets added
    //this will be the code that tests if our order transaction classes work
    //customer.add(cart);
    
    Item item1 = new Item("Pepsi", 12345656);//set price,id and name of item 1
    item1.setPrice(3);
    Item item2 = new Item("Mints", 94512345);
    item2.setPrice(11);
    Item item3 = new Item("Pizza", 71234455);
    item3.setPrice(12);
    
    cart.addItems(item1);//adds item1 to the cart
    cart.addItems(item2);
    cart.addItems(item3);
    
    cart.lockCart();//this stops further items being added to the cart
    cart.print();//prints
    
    Address Address = new Address("Shopstreet,", "Galway,", "H9122T,", "Ireland","Sesame Street,", "Antwerp,", "P91 Q33T,", "Belguim \n" );//sets address
    
    Order order = new Order(customer, cart);
    order.printOrder();
    Address.printAddress();//prints address
    
    Payment payment = new Payment("VISA", 234566671, "11/23", order);//set the details of the payment
    payment.verify();//checks the spelling and length of card digits
    payment.printPaymentInfo();
    
    email email = new email(order, customer, payment);
    email.getEmail();
    email.sendConfirmEmail();//prints email
     System.out.println("***************************************************");//end of scenario 1
}

public void transaction2(){
    //the body of our code for the first scenario will go here
    Customer customer = new Customer("Sean", "O' Connor", "BigSeanC@gmail.com");
    //now add the shopping cart:
    ShoppingCart cart = new ShoppingCart(customer);
    //this will be the code that tests if our order transaction classes work
    
    Item item1 = new Item("fanta", 12464758);
    item1.setPrice(3);
    Item item2 = new Item("mints", 17446332);
    item2.setPrice(2);
    Item item3 = new Item("role", 71234455);
    item3.setPrice(15);
    
    cart.addItems(item1);
    cart.addItems(item2);
    cart.addItems(item3);
    
    cart.print();
    cart.removeItem(1);//this removes the 2nd item that was added to the cart(starts at 0) so "1" would be the middle item = mints.
    cart.lockCart();//lock
    cart.print();
    
    Address Address = new Address("YellowBrick Road,", "Dublin,", "W92 A53Y,", "Ireland","GreenBrick Road,", "Dublin,", "L91 N11T,", "Ireland \n" );
    
    Order order = new Order(customer, cart);
    order.printOrder();
    Address.printAddress();
    
    
    Payment payment = new Payment("MUSTERCARD", 234955467, "11/09", order);
    payment.verify();
    payment.printPaymentInfo();
    
    email email = new email(order, customer, payment);
    email.getEmail();
    email.sendConfirmEmail();
    System.out.println("***************************************************");//end of scenario 2
}


}
