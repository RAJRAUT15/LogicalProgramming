package assignment;
import java.util.*;
public class ProfitLoss {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Selling price:");
		float sell=sc.nextFloat();
		System.out.println("Enter The Purchasing Price:");
		float pur=sc.nextFloat();
		if(sell>pur)
		{
			System.out.println("Proffit:"+(sell-pur));
			System.out.println("Percent Of Proffit:"+(((sell-pur)/pur)*100));
			
		}else if(pur>sell)
		{
			System.out.println("Loss:"+(pur-sell));
			System.out.println("Percentage Of Loss:"+(((pur-sell)/pur)*100));
		}
		else if(sell==pur)
		{
			System.out.println("There Is No Loss And Proffit:");
		}
	}

}
