import java.io.*;
import java.util.*;
class polygon
{
	void area(double a)
	{
		System.out.println("area of sq is"+a*a);
	}
	void area(double l,double b)
	{
		System.out.println("area of rect is"+l*b);
	}
	void area(double a,double b,double c)
	{
		double s=(a+b+c)/2;
		double d=(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of tri="+String.format("%.2f",Math.sqrt(d)));
	}
}
class polygonarea
{
	public static void main(String args[])
	{
		polygon p=new polygon();
		p.area(2,3);
		p.area(6,7);
		p.area(2,4,6);
	}
}