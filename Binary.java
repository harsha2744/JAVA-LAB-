import java.io.*;
import java.util.*;
public class Binary
{
  public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no between 1 and 255");
		int n=s.nextInt();
		if(n>255||n<1)
		{
			System.out.println("enter no between 1 and 255");
		}
		else
		{
		String b=String.format("%08d",Integer.valueOf(Integer.toString(n,2)));
		System.out.println("binary value is"+b);
}
}
}

