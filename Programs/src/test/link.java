package test;
import java.util.*;
public class link {
public static void main(String x[])
{
	LinkedList l=new LinkedList();
	l.add(12);
	l.add(13);
	l.add(15);
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());	
	}
	
	
}
}
