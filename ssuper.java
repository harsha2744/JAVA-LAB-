class student
{
int id;
String name;
student(int id,String name)
{
	this.id=id;
	this.name=name;
	System.out.println("name="+name);
}
class grade extends student
{
	int marks;
	grade(int id,String name,int marks)
	{
		super(id,name);
		this.marks=marks;
		System.out.println(+id+""+name+""+marks);
	}
}
}
public class ssuper
{
	public static void main(String args[])
	{
		grade d=new grade(10,"harsha",100);
		grade d1=new grade(20,"siva",99);
	}
}