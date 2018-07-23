package GenaralPrograms;

public class angle {
	
	static int calangle(double h,double m)
	{
		
		if(h<0||m<0||h>12||m>60)
		{
			System.out.println("Wrong Input....");
		}
		if(h==12)
		{
			h=0;
		}
		if(m==60)
		{
			m=0;
		}
		int hour_ang=(int)(0.5*(h*60+m));
		int minute_ang=(int)(6*m);
		int angle=Math.abs(hour_ang-minute_ang);
		angle=Math.min(360-angle,angle);
		return angle;
		
		
	}
	
	public static void main(String x[])
	{
		System.out.println(calangle(9,60)+" Degree");
		System.out.println(calangle(12,15)+" Degree");
		
		
	}

}
