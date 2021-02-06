import java.util.ArrayList;//needed for ArrayList
import java.util.Random;//needed to use math.random

public class ShoppingCart
{
    private ArrayList<String> itemsInCart = new ArrayList<String>();
    private ArrayList<Integer>orderPrices = new ArrayList<Integer>();
    private Item item;
    private long cartId;
    private int itemPrice;
    private Customer customer;
    private boolean lock = false;
    private double total;

    
    
    public ShoppingCart(Customer customer)
    {
        this.customer = customer;//customer added to cart
        cartId = makeCartId();
    }
    
   
    public void add(Item item)
    {
        this.item = item;
    }
    
    public void lockCart()
    {
        lock = true;//locks cart if true
    }
    
    public void addItems(Item item)//adds item
    {
        orderPrices.add(item.getPrice());  
        if(lock == false)
        {
            itemsInCart.add(item.toString());
        }
        else
        {
            System.out.println("The Cart is now Locked");//prints once the cart has been locked
        }
    }
    
    public int removeItem(int c)//remove method 
    {
     itemsInCart.remove(c);
     orderPrices.remove(c);
     total = 0;//stops the total before item removed being added to total after item is removed
     return c;
    }
    
    public long makeCartId()
    {
        Random rand = new Random();
        return rand.nextInt(100000000);//creates random cart id with limit 100000000 
    }
    
    public long getCartId()
    {
        return cartId;
    }
    
    public void print()
    {
        System.out.println("The Items in the Shopping Cart Are:");
        for (int i = 0; i < itemsInCart.size(); i++)
        {
            System.out.println(itemsInCart.get(i));
        }
        
        for (int i = 0; i < orderPrices.size(); i++)
        {
            total += orderPrices.get(i);//gets total sum price of the items
        }
        System.out.println("Total Cost Of Order: \n£" +total);//prints total price
    }
    
    public ArrayList<String> orderArray()
    {
        ArrayList<String> orderItems = new ArrayList<String>();
        for (int i = 0; i < itemsInCart.size(); i++){
            String temp = itemsInCart.get(i);
            orderItems.add(temp);
        }
        return orderItems;
    }
    
    
}
