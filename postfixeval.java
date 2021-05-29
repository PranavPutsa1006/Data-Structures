import java.util.Scanner;


class stack
{
	private int maxsize;
	private int[] a;
	private int top;
	public stack(int size)
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
			return 1;
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

class postfixeval
{
	public static void main(String args[])
	{
		stack s1=new stack(5);
		Scanner s=new Scanner(System.in);
		int i,res=0;
		char ch;
		int op1,op2;
		String str="abc-*";
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				System.out.println("Enter the value of "+str.charAt(i));
				int data=s.nextInt();
				s1.push(data);
			}
			else
			{
				op1=s1.pop();
				op2=s1.pop();
				if(str.charAt(i)=='+')
					res=op2+op1;
				else if(str.charAt(i)=='-')
					res=op2-op1;
				else if(str.charAt(i)=='/')
					res=op2/op1;
				else if(str.charAt(i)=='*')
					res=op2*op1;
				s1.push(res);
			}
		}
		System.out.println(s1.pop());
	}
}