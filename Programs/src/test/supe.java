package test;
class ab
{
	ab()
	{
		System.out.println("Hi");
	}
	void ak()
	{
		System.out.println("me");
	}
}
class ac extends ab
{
ac()
{ak();
super.ak();
	System.out.println("bye");
}
void ak()
{
	System.out.println("jay");
}
}
public class supe {
public static void main(String x[]) {
	ac ob=new ac();
}
}
