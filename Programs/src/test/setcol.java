package test;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class setcol {
	public static void main(String x[])
	{
		Set<String> se=new HashSet<>();
		se.add("raj");
		se.add("mahesh");
		se.add("ganesh");
		
		for(String str:se)
		{
			System.out.println(str);
		}
		
	}

}
