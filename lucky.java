import java.io.*;

import java.util.*;

import java.lang.*;

class Lucky

{

    public static void main(String args[])

    {

	int i,n,sum=0;

	int a[] = new int[20];

	System.out.println("Enter number of elements : ");

	Scanner s = new Scanner(System.in);

	n = s.nextInt();

	System.out.println("Enter elements to array : ");

	for(i=0;i<n;i++)

	{

	    a[i] = s.nextInt();

	}

   	LuckyNumber(n,a);

    }



    public static void LuckyNumber(int n,int a[])

    {

	int i,j,c=0,sum=0;

	int b[] = new int[20];

	for(i=0;i<n;i++)

	{

           sum = 0;

	   for(j=1;j<8;j++)

	   {

         	sum += Math.pow(7,j);

		if(a[i] == sum)

		{

		    b[c] = a[i];

		    c++;

		    break;

		}

	   }

	}

 	System.out.println("Number of Lucky Numbers are : "+c);

	System.out.print("Lucky Numbers are : ");

	for(i=0;i<c;i++)

	{

	      System.out.print("  "+b[i]);

	}

    }

}