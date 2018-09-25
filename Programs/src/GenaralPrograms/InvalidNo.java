package GenaralPrograms;

public class InvalidNo {
	public static void main(String x[]) {
		int valid=0;
		int invalid = 0;
		int no;
		for(int i=0;i<x.length;i++)
		{
			try
			{
				no=Integer.parseInt(x[i]);
			}
			catch(NumberFormatException e)
			{
				invalid=invalid+1;
				System.out.println("Invalid No is:"+x[i]);
				continue;
			}
			valid=valid+1;
		}
		System.out.println("Valid No:"+valid);
		System.out.println("Invalid No:"+invalid);
	}

}
