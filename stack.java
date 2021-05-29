import java.util.Scanner;

class stackx
{
	private int maxsize;
	private int[] a;
	private int top;
	public stackx(int size)
	{
		maxsize=size;
		a=new int[maxsize];
		top=-1;
	}
	
	public int isFull()
	{
		if(top==maxsize-1)
			return 1;
		else
			return 0;
	}
	
	public void push(int e)
	{
		if(top==maxsize-1)
			System.out.println("Overflow");
		else
		{
			top++;
			a[top]=e;
		}
	}
	
	public int pop()
	{
		if(top==-1)
			{
			System.out.println("Underflow");
			return -1;
			}
		else
		{
			int x=a[top];
			top--;
			return x;
		}
	}
	
	public int isEmpty()
	{
		if(top==-1)
			return(1);
		else
			return 0;
	}
	
	public int top_element()
	{
		if(top==-1)
			{
			System.out.println("Stack is empty");
			return -1;
			}
		else
			return a[top];
	}
	
	public int size()
	{
		return(top++);		
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
			System.out.println(a[i]);
	}
}

public class stack
{
	public static void main(String args[])
	{
		int e,option;
		String c;
		stackx s1=new stackx(5);
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("1.Push\n 2.pop\n 3.isFull\n 4.isEmpty\n 5.Top Element\n 6.size\n 7.display.\nEnter option");
			option=s.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Element");
				e=s.nextInt();
				s1.push(e);
				break;
			case 2:
				System.out.println(s1.pop());
				break;
			case 3:
				if(s1.isFull()==1)
					System.out.println("Full");
				else
					System.out.println("Not full");
				break;
			case 4:
				if(s1.isEmpty()==1)
					System.out.println("Empty");
				else
					System.out.println("Not Empty");
				break;
			case 5:
				if(s1.top_element()==-1)
					System.out.println("Stack is Empty");
				else
					System.out.println(s1.top_element());
				break;
			case 6:
				System.out.println(s1.size());
				break;
			case 7:
				s1.display();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}	
			System.out.println("Do you want to continue?y/n");
			c=s.next();	
			
		}while(c!="n");
	}
	
}