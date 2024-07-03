import java.util.*;
class WrongBranchCodeException extends Exception
{
	WrongBranchCodeException(String s1)
	{
		 super(s1);
	}
}
class WrongBranchNameException extends Exception
{
	
	 WrongBranchNameException(String s2)
	{
		super(s2);
	}
}
class WrongRollNumberException extends Exception
{
	WrongRollNumberException(String s3)
	{
		super(s3);
	}
}
class userdefined
{
	public static void main(String args[])
	{
		try
		{
			int b;
			Scanner scan=new Scanner(System.in);
			b=scan.nextInt();
			if(b!=5)
			{
				throw new WrongBranchCodeException("you are belong to cse");
			}
			string branch;
			branch=scan.next();
			if(branch.compareTo("CSE")!=0)
			{
				throw new WrongBranchNameException("enter wrong name");
			}
			String rollno;
			rollno=scan.next();
			if(rollno.length()!=10)
			{
				throw new WrongRollNumberException("wrong roll");
			}
		}
		catch(WrongBranchCodeException e)
		{
			System.out.println(e);
		}
		catch(WrongBranchNameException e)
		{
			System.out.println(e);
		}
		catch( WrongRollNumberException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("final");
		}
	}
}
			