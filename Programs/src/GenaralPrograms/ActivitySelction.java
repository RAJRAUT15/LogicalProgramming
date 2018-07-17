package GenaralPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;



public class ActivitySelction {
public static void printmaxactivities(int s[],int f[],int n)
{
	int i,j;
	System.out.print("Following Activities are selected:");
	i=0;
	System.out.print(i+"");
	for(j=1;j<n;j++)
	{
		if(s[j]>=f[i]) {
			
	
		System.out.println(j+"");
		
		}
	}
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {1,3,0,5,8,5};
		int f[]= {2,4,6,7,9,9};
		int n=s.length;
printmaxactivities(s,f,n);

	}

}
