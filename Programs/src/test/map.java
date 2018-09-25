package test;
import java.util.*;
public class map {
	public static void main(String x[])
	{
		Map<String,Integer> mp=new TreeMap<>();
		mp.put("r", 1);
		mp.put("a", 2);
		mp.put("j", 3);
		//System.out.println(mp.get("a"));
		Set<String> keys=mp.keySet();
		
		for(String key:keys)
		{
		System.out.println(key+" "+mp.get(key));
		}
		
	}

}
