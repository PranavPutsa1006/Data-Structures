import java.util.Scanner;

class stud
{
	int rno;
	int mark[];
	String name;
	public stud()
	{
		mark=new int[3];
	}
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student roll number");
		rno=s.nextInt();
		System.out.println("Enter student name");
		name=s.next();
		System.out.println("Enter 3 subjects'marks");
		for(int i=0;i<3;i++)
			mark[i]=s.nextInt();
		s.close();
	}
	
	void print()
	{
		System.out.print("Roll number:");
		System.out.println(rno);
		System.out.print("name:");
		System.out.println(name);
		System.out.print("Student's marks:");
		for(int i=0;i<3;i++)
			System.out.println(mark[i] );
		
	}
}

class p03
{
	public static void main(String args[])
	{
		stud s1=new stud();
		s1.read();
		s1.print();
	}
}