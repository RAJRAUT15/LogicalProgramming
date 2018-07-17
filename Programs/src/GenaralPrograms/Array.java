package GenaralPrograms;
import java.util.*;
/*class Student
{int id;
String Name;
	void show()
	{
		
	}
}*/
public class Array {
public static void main(String X[])
{
	//int a[]=new int[5];
	int a[][]=new int[4][4];
	//Student s1=new Student();
	System.out.println("Enter the No");
Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
