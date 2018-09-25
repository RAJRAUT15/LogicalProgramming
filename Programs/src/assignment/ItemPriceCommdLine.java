package assignment;

public class ItemPriceCommdLine {
public static void main(String x[])
{
	int price,tprice,quantity;
	quantity=Integer.parseInt(x[0]);
	tprice=Integer.parseInt(x[1]);
	price=tprice/quantity;
	System.out.println("Price Of Item: "+price);
	
	
}
}
