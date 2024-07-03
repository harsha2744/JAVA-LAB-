import java.io.*;
import java.util.*;
class test
{
	int a,b,t;
	void swap(int a,int b)
	{
		System.out.println("before swapping a="+a+"b="+b);
		t=a;
		a=b;
		b=t;
		System.out.println("Aftr swapping a="+a+"b="+b);
	}
}
class swap
{
	public static void main(String args[])
	{
		test te=new test();
		Scanner scan=new Scanner(System.in);
		te.a=scan.nextInt();
		te.b=scan.nextInt();
		te.swap(te.a,te.b);
	}
}