import java.io.*;
import java.util.*;
import java.lang.*;
class exceptionhanding
{
	public static void main(String args[])
	{
		try
		{
			int a,c,d,x;
			a=integer.parseInt(args[0]);
			x=36/a;
			System.out.println("division result is"+x);
			
			int b[]=new int[10];
			b[a]=Integer.parseInt(args[1]);
			System.out.println("element is"+b[a]);

			c=Integer.parseInt(args[2]);
			System.out.println("given nos is"+c);
			
			System.out.println("string at 5th index is"+args[3].chatAt(5));

			if(args[3].length()<10)
			{
				String s=null;
				System.out.println("lengh is"+s.length());
			}
			else
			{
				System.out.println("given str is",+args[3]);
			}
		}
	catch(ArithmeticExeption e1)
	{
		System.out.println(e1);
	}
	catch(ArrayIndexOutOfBoundsException e2)
	{
		System.out.println(e2);
	}
	catch(NumberFormatException e3)
	{
		System.out.println(e3);
	}
	catch(StringIndexOutOfBoundsException e4)
	{
		System.out.println(e4);
	}
	catch(NullPointerException e5)
	{
		System.out.println(e5);
	}
}

}

			