package test;
import java.util.*;

public class list {
	public static void main(String x[])
	{
		List ls=new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		Iterator ir=ls.iterator();
		while(ir.hasNext())
		{
		System.out.println(ir.next());
		
		}
		
	}

}
