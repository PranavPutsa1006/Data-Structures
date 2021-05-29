import java.util.Scanner;

class validity
{
	public int rank(String x)
	{
		
		char ch;
		int i,operator=0,operand=0,rank=0;
		
		for(i=0;i<x.length();i++)
		{
			ch=x.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				operand++;
			}
			else
			{
				operator++;
			}
		}
		rank=operand-operator;
		return rank;		
	}
	
	public int counter(String y)
	{
		int c=0,i;
		char ch;
		for(i=0;i<y.length();i++)
		{
			ch=y.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				c++;
			}
			else
			{
				c--;
			}
			if((c!=1)&&(c!=0))
				return 0;
		}
		return c;
	}
	
}

class infix_validity
{
	public static void main(String args[])
	{
		validity v=new validity();
		String c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an infix expression");
		c=s.next();
		int p=((v.rank(c))&(v.counter(c)));
		if(p==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}