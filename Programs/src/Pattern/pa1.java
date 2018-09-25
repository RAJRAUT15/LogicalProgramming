package Pattern;

public class pa1 {
	public static void main(String x[]) {
		for(char i='A';i<='E';i++)
		{
			for(char k='E';k>=i;k--)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

}
