import java.util.Scanner;

class p02
{
	public static void main(String args[])
	{
		int n,i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		int a[]=new int[20];
		System.out.println("Enter "+n+" elements into the array");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the key element");
		k=s.nextInt();
		linear_search(a,n,k);
		s.close();
		
	}
	static void linear_search(int x[],int n,int k)
	{
		int i,flag=0;
		for(i=0;i<n;i++)
		{
			if(x[i]==k)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(""+k+ " found at position "+(i+1)+ "");
		else if(flag==0)
			System.out.println("Element not found");
	}
}
