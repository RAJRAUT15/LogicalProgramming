package assignment;
import java.io.*;
public class RevDigitDataInput {
	public static void main(String x[]) throws IOException
	{
		int no,rem,rev=0;
		DataInputStream xyz=new DataInputStream(System.in);
		System.out.println("Enter The No:");
		no=Integer.parseInt(xyz.readLine());
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse: "+rev);
	}

}