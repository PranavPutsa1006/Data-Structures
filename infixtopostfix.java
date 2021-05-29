import java.util.Scanner;

class stack
{
	private int maxsize;
	private char[] a;
	private int top;
	public stack(int size)
	{
		maxsize=size;
		a=new char[maxsize];
		top=-1;
	}
	
	public int isFull()
	{
		if(top==maxsize-1)
			return 1;
		else
			return 0;
	}
	
	public void push(char e)
	{
		if(top==maxsize-1)
			System.out.println("Overflow");
		else
		{
			top++;
			a[top]=e;
		}
	}
	
	public char pop()
	{
		if(top==-1)
			{
			System.out.println("Underflow");
			return(1);
			}
		else
		{
			char x=a[top];
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
	
	public char top_element()
	{
		if(top==-1)
			{
			System.out.println("Stack is empty");
			return 1;
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

public class infixtopostfix
{
	static boolean isAlpha(char ch)
	{
		 if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
			 return true;
		 else
			 return false;
	}
	static int prec(char ch)
	{
		switch(ch)
		{
		case '(':
		case '#':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
			
		}
	}
	static void infixpostfix(String infix)
	{
		int i;
		stack st=new stack(10);
		st.push('#');
		for(i=0;i<infix.length();i++)
		{
			char infi=infix.charAt(i);
			if(isAlpha(infi))
				System.out.print(infi);
			else if(infi=='(')
				st.push(infi);
			else if(infi==')')
			{
				while(st.top_element()!='(')
					System.out.print(st.pop());
				char m=st.pop();
			}
			else if(infi=='#')
			{
				while(st.top_element()!='#')
					System.out.print(st.pop());
			}
			else
			{
				while(prec(infi)<=prec(st.top_element()))
					System.out.print(st.pop());
				st.push(infi);
			}
		}
	}
	
	public static void main(String args[])
	{
		String exp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an infix expression");
		exp=s.next();
		infixpostfix(exp);
		s.close();
			
	}
}
