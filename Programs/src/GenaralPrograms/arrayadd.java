package GenaralPrograms;
//import java.util.*;
class Add
{int sum=0;
	public int sum(int...n)
	{
		for(int i:n)
		sum=sum+i;
		return sum;
	}
}
public class arrayadd {
	public static void main(String x[])
	{
		Add ob=new Add();
		//System.out.println("Enter The Value:");
		//Scanner sc=new Scanner(System.in);
		ob.sum(1,2,3,4,5,6,7,89,1);
		System.out.println(ob.sum);
	}

}
