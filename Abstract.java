import java.io.*;
import java.util.*;
abstract class shape
{
	abstract void noofsides();
}
class trapezoid extends shape
{
void noofsides()
{
	System.out.println("trp has 4 sides");
}
}
class triangle extends shape
{
	void noofsides()
	{
		System.out.println("tri has 3 sides");
	}
}
class hexagon extends shape
{
	void noofsides()
	{
		System.out.println("hex has 6 sides");
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		trapezoid tr=new trapezoid();
		tr.noofsides();
		triangle trr=new triangle();
		trr.noofsides();
		hexagon hx=new hexagon();
		hx.noofsides();
	}
}