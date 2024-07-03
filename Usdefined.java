import java.util.*;
import java.lang.*;
class WrongBranchCode extends Exception
{
  WrongBranchCode(String s1)
{
 super(s1);
}
}
class WrongBranchName extends Exception
{
  WrongBranchName(String s2)
{
super(s2);
}
}
class WrongBranchNumber extends Exception
{
  WrongBranchNumber(String s3)
{
super(s3);
}
}
class Usdefined
{
public static void main(String args[])
{
 try
{
Scanner s=new Scanner(System.in);
System.out.println("Enter branch code:");
int a=s.nextInt();
if(a!=5)
{
 throw new WrongBranchCode("not CSE");
}
String b=s.next();
if(b.compareTo("CSE")!=0)
{
   throw new WrongBranchName("not wrond name of te branch entereed CSE");
}
String n=s.next();
if(n.length()!=10)
{
 throw new WrongBranchNumber("Enter wriond entereeeed numne branch code:");
}
}
catch(WrongBranchCode e)
{
System.out.println(e);
}
catch(WrongBranchNumber e)
{
System.out.println(e);
}
catch(WrongBranchName e)
{
System.out.println(e);
}
finally
{
System.out.println("ok1");
}
}
}