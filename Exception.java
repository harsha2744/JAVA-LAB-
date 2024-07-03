import java.lang.*;
class Exception
{
public static void main(String arg[]){
try
{
int a=Integer.parseInt(arg[0]);
int c;
c=a/23;
System.out.println("dv   :"+c);
int b[]=new int[20];
b[a]=Integer.parseInt(arg[1]);
System.out.println("Array eelemant:"+b[a]);
int f=Integer.parseInt(arg[2]);
System.out.println("numm:"+f);

System.out.println(" cccccc:"+arg[3].charAt(5));
if(arg[3].length()<3)
{
String s=null;
System.out.println(s);
}
else 
{
System.out.println("strinrhf:"+arg[3]);
}
}
catch(ArithmeticException e1)
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
finally
{
System.out.println("finally");
}
}
}