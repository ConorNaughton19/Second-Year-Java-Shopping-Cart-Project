import java.util.ArrayList;
public class Address 
{
   private String shipStreet;
   private String shipCity;
   private String shipEir;
   private String shipCountry;
   private String billStreet;
   private String billCity;
   private String billEir;
   private String billCountry;
   
    //this allows the address to be set Street,City,Zipcode and Country
    public Address(String shipStreet, String shipCity, String shipEir, String shipCountry, String billStreet, String billCity, String billEir, String billCountry)
    { 
       this.shipStreet = shipStreet;
       this.shipCity = shipCity;
       this.shipEir = shipEir;
       this.shipCountry = shipCountry;
       this.billStreet = billStreet;
       this.billCity = billCity;
       this.billEir = billEir;
       this.billCountry = billCountry;
    }
    //prints address
    public void printAddress()
    {
     System.out.println("Shipping Address: "+shipStreet+" "+shipCity+" "+shipEir+" "+shipCountry); //prints out shipping address
     System.out.println("Billing Address: "+billStreet+" "+billCity+" "+billEir+" "+billCountry);//prints out billing address
    }
}
 