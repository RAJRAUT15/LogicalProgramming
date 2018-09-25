package assignment;

public class SwapNoCommdLine {
public static void main(String ar[])
{
	int x,y;
	x=Integer.parseInt(ar[0]);
	y=Integer.parseInt(ar[1]);
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
}
}
