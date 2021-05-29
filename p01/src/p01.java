import java.util.Scanner;

class p01
{
	public static void main(String args[])
	{
		int n,i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		int a[]=new int[10];
		System.out.println("Enter "+n+" elements into the array");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the key element");
		k=s.nextInt();
		for(i=0;i<n;i++)
		{
		if(a[i]==k)
			break;
		}
		System.out.println(""+k+ " found at position "+(i+1)+ "");
		s.close();
		
	}
}
