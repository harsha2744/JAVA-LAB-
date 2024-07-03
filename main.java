class student
{
	int id,marks;
	String name;
	String grade;
	student(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	student(int id,int marks,String name,String grade)
	{
		this(id,marks,name);
		this.grade=grade;
		System.out.println(+id+""+marks+""+name+""+grade);
	}
}
public class Main
{
	public static void main(String args[])
	{
		student d1=new student(10,100,"vani");
		student d2=new student(10,100,"vani","A");
	}
}