public class Payment
{
    private int cardNum, mon, year;
    private String type, expiry;
    
    public Payment(String type, int cardNum, String expiry, Order order)
    {
        this.type = type;
        this.cardNum = cardNum;
        this.expiry = expiry;
    }
    
    public boolean verify()
    {
        mon = Integer.parseInt(expiry.substring(0,2));//checks digit 1,2
        year= Integer.parseInt(expiry.substring(3,5));//checks digits 
        type = type.toUpperCase();
        
        if (year > 20)//if the year is smaller than 2020 test fails 
        {
           if(String.valueOf(cardNum).length()==9 && (type.equals("VISA")||type.equals("MASTERCARD")))//if the length entered for the card is less/more than 8 test fails
           {
               System.out.println("balance paid in full");//successful print statement
               return true;
            }
        }
        else if(year == 20 && mon > 10 && String.valueOf(cardNum).length() == 9 && (type.equals("VISA")||type.equals("MASTERCARD")))
        {
            System.out.println("balance paid in full");
            return true;
        }
        else 
        {
             System.out.println("\nInvalid expiry date ");//negative print statement
             return false;
        }

        return false;
    }    
    public void printPaymentInfo()
    {
       
        System.out.println("Type of card: "+type);
        System.out.println("Card Number: "+ cardNum);//print
        System.out.println("Expiry Date: "+ expiry +"\n");
    }
}

    