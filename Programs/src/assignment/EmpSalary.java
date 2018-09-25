package assignment;
import java.io.*;
import java.lang.*;
class employee
{
	int empid;
	String name;
	float bsal;
	employee(int id,String nm,float sl)
	{
	 empid=id;
	 name=nm;
	 bsal=sl;
	}
	void display()
	{
		float da=bsal*30/100;
		float hra=bsal*30/100;
		float gross_sal=bsal+da+hra;
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Total Salary: "+gross_sal);
	}
}
public class EmpSalary {
public static void main(String x[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the Employee Id:");
 int emp_id=Integer.parseInt(br.readLine());
 System.out.println("Enter the Employee Name:");
 String emp_name=br.readLine();
 System.out.println("Enter the Employee Basic Salary:");
 float emp_bsal=Float.parseFloat(br.readLine());
 employee em=new employee(emp_id,emp_name,emp_bsal);
 em.display();
}
}
