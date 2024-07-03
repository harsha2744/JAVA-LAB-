class student
{
	int id,marks;
	string name;
	string grade;
	student(int id,int marks,string name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	student(int id,int marks,string name,string grade)
	{
		this(id,marks,name,grade);
		this.grade=grade;
		System.out.println(+id+""+name+""+grade);
	}
}
public class main
{
	public static void main(String args[])
	{
		student d1=new student(10,100,"vani","A");
	}
}