import java.util.Scanner;


 class cirQue
{
	 private int maxsize;
		private int f,r,a[];
		public cirQue(int s)
		{
			maxsize=s;
			a=new int[5];
			f=r=-1;
		}
		void enqueue(int x)
		{
			if(f==(r+1)%maxsize)
				System.out.println("Overflow");
			else if(f==-1||r==-1)
			{
				f++;
				r++;
				a[r]=x;
			}
			else
			{
				r=(r+1)%maxsize;
				a[r]=x;
			}
		}
		int dequeue()
		{
			if(f==-1)
				{
				return -1;
				}
			else if(f==r)
			{
				int x=a[f];
				f=r=-1;
				return x;
			}
			else
			{
				int x=a[f];
				f=(f+1)%maxsize;
				return x;
			}
		}
		int size()
		{
			if(f!=-1)
				return r-f+1;
			else
				return 0;
		}
		void display()
		{
			int i;
			for(i=f;i!=r;i=(i+1)%maxsize)
				System.out.println(a[i]);
			System.out.println(a[i]);
		}
		int isFull()
		{
			if(f==(r+1)%maxsize)
			{
				return 1;
			}
			else
				return 0;
		}
		int isEmpty()
		{
			if(f==-1)
				return 1;
			else
				return 0;
		}
		int front_element()
		{
			if(f==-1)
			{
				return -1;
			}
			else
				return a[f];
		}
		int rear_element()
		{
			if(r==-1)
				return -1;
			else
				return a[r];
		}
}
public class circularQ 
{
	public static void main(String[] args) 
	{
		cirQue q=new cirQue(5);
		int e,option;
		char c;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println(" 1.enqueue\n 2.dequeue\n 3.isFull\n 4.isEmpty\n 5.Front Element\n 6.Rear Element\n 7.size\n 8.display.\nEnter option");
			option=s.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Element");
				e=s.nextInt();
				q.enqueue(e);
				break;
			case 2:
				System.out.println(q.dequeue());
				break;
			case 3:
				if(q.isFull()==1)
					System.out.println("Full");
				else
					System.out.println("Not full");
				break;
			case 4:
				if(q.isEmpty()==1)
					System.out.println("Empty");
				else
					System.out.println("Not Empty");
				break;
			case 5:
				if(q.front_element()==-1)
					System.out.println("Stack is Empty");
				else
					System.out.println(q.front_element());
				break;
			case 6:
				if(q.rear_element()==-1)
					System.out.println("Stack is Empty");
				else
					System.out.println(q.rear_element());
				break;	
			case 7:
				System.out.println(q.size());
				break;
			case 8:
				q.display();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}	
			System.out.println("Do you want to continue?y/n");
			c=s.next().charAt(0);	
			
		}while(c!='n');
	}

}
