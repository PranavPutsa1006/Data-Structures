import java.util.Scanner;

class emp
{
	String name;
	int id,bpay;
	int netsal;
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee name");
		name=s.next();
		System.out.println("Enter id");
		id=s.nextInt();
		System.out.println("Enter basic pay");
		bpay=s.nextInt();
		netsal(bpay);
	}
	
	void netsal(int x)
	{
		int hri=(int) (0.1*bpay);
		netsal=x-hri;
		print(netsal);
	}
	
	void print(int n)
	{
		System.out.print("Employee name:");
		System.out.println(name);
		System.out.print("Employee id:");
		System.out.println(id);
		System.out.print("Employee basic sal:");
		System.out.println(bpay);
		System.out.print("Employee netpay:");
		System.out.println(n);
	}
}
class p04
{
	public static void main(String args[])
	{
		emp e=new emp();
		e.read();
	}
}
