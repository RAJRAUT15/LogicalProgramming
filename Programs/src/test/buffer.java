package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class buffer {
	public static void main(String x[]) throws Exception
	{
		System.out.println("Buffer Reader");
		int n=0;
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
		{
			
					
			n=Integer.parseInt(br.readLine());
					
		}
		System.out.println(n);
	}

}
