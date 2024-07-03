import java.util.*;
class WrongBranchCodeExcetion extends Exception
{
    WrongBranchCodeExcetion(String s1)
    {
    super(s1);
    }
}

class WrongBranchNameExcetion extends Exception
{
    WrongBranchNameExcetion(String s2)
    {
    super(s2);
    }
}

class WrongRollNumberExcetion extends Exception
{
    WrongRollNumberExcetion(String s3)
    {
    super(s3);
    }
}

class UserDefinedException
{
    public static void main(String args[])  
    {  
    try
        {
         int b;
         Scanner s = new Scanner(System.in);
         System.out.print("Enter Branch Code : ");
         b = s.nextInt();
         if(b != 5)
         {
            throw new WrongBranchCodeExcetion("You are not belong to CSE");
         }
        
         String branch;
         System.out.print("Enter Branch Name : ");
         branch = s.next();
         if(branch.compareTo("CSE") != 0)
         {
            throw new WrongBranchNameExcetion("You are entered wrong branch name");
         }

         String rno;
         System.out.print("Enter Roll Number : ");
         rno = s.next();
         if(rno.length() != 10)
         {
            throw new WrongRollNumberExcetion("You are entered wrong roll number");
         }
        }
        catch(WrongBranchCodeExcetion e)
        {
         System.out.println(e);
        }
    catch(WrongBranchNameExcetion e)
        {
         System.out.println(e);
        }
    catch(WrongRollNumberExcetion e)
        {
         System.out.println(e);
        }
finally
{
   System.out.println("finally block is executed");
    }
}
}