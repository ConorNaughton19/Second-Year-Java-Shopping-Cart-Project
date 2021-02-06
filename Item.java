public class Item
{
    // instance variables
    private String name;
    private int price;
    private long itemId;

    public Item(String itemName, long id)
    {
        name = itemName;
        itemId = id;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public int getPrice() 
    {
        return price;
    }

    //@Override
    public String toString()
    {
        String out = "Item Id: " + itemId + "\tItems: " + name + "\tPrice: " + price;//this is the structure that the items will be ordered in
        return out;
    }
}
