import java.io.*;
import java.util.*;
class Sgpa
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,gp=0;
		String grade;
		double sum=0,sgpa,total=0;
		String subject[]={"mefa","pands","dld","oops","dbms","rlab","oopslab","dbmslab","lbap"};
		double credits[]={3,3,3,3,3,1,2,2,1};
		for(i=0;i<subject.length;i++)
		{
			System.out.println("enter"+subject[i]+"grade");
			 grade=s.next();
			switch(grade)
			{
				 case "A+":gp=10; break;

		 case "A": gp=9; break;

		 case "B": gp=8; break;

		 case "C": gp=7; break;

		 case "D": gp=6; break;

		 case "E": gp=5; break;

		 case "F": gp=0; break;

		 default: System.out.println("Wrong Grade.");

			  i--;		
				
			}
			if(gp==0)
			break;
			total+=gp*credits[i];
			sum+=credits[i];
		}
	
	if(gp==0)
	System.out.println("fail");
	else
	{
		sgpa=total/sum;
		System.out.println("Sdpa is"+String.format("%2f",sgpa));
	}
}
}	


