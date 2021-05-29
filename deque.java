import java.util.Scanner;


class deq
{

	 private int maxsize;
		private int f,r,a[];
		public deq(int s)
		{
			maxsize=s;
			a=new int[5];
			f=r=-1;
		}
		void insert_rear(int x)
		{
			if(r==maxsize-1)
				System.out.println("Overflow");
			else if(f==-1||r==-1)
			{
				f++;
				r++;
				a[r]=x;
			}
			else
			{
				r++;
				a[r]=x;
			}
		}
		int delete_front()
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
				f++;
				return x;
			}
		}
		void insert_front(int x)
		{
			if(f==0)
				System.out.println("Overflow");
			else if(f==-1||r==-1)
			{
				f++;
				r++;
				a[f]=x;
			}
			else
			{
				f--;
				a[f]=x;
			}
		}
		int delete_rear()
		{
			if(f==-1)
				{
				return -1;
				}
			else if(f==r)
			{
				int x=a[r];
				f=r=-1;
				return x;
			}
			else
			{
				int x=a[r];
				r--;
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
			for(i=f;i<=r;i++)
				System.out.println(a[i]);
		}
		int isFull()
		{
			if(r==maxsize-1 && f==0)
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
public class deque 
{
	public static void main(String[] args) 
	{

		deq q=new deq(5);
		int e,option;
		char c;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println(" 1.insert_rear\n 2.delete_front\n 3.insert_front\n 4.delete_rear\n 5.isFull\n 6.isEmpty\n 7.Front Element\n 8.Rear Element\n 9.size\n 10.display.\nEnter option");
			option=s.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Element");
				e=s.nextInt();
				q.insert_rear(e);
				break;
			case 2:
				System.out.println(q.delete_front());
				break;
			case 3:
				System.out.println("Enter Element");
				e=s.nextInt();
				q.insert_front(e);
				break;
			case 4:
				System.out.println(q.delete_rear());
				break;	
			case 5:
				if(q.isFull()==1)
					System.out.println("Full");
				else
					System.out.println("Not full");
				break;
			case 6:
				if(q.isEmpty()==1)
					System.out.println("Empty");
				else
					System.out.println("Not Empty");
				break;
			case 7:
				if(q.front_element()==-1)
					System.out.println("Stack is Empty");
				else
					System.out.println(q.front_element());
				break;
			case 8:
				if(q.rear_element()==-1)
					System.out.println("Stack is Empty");
				else
					System.out.println(q.rear_element());
				break;	
			case 9:
				System.out.println(q.size());
				break;
			case 10:
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
