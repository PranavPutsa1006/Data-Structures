import java.util.Scanner;


class dnode
{
	public int info;
	public dnode next,prev;
	public dnode(int x)
	{
		info=x;
		prev=next=null;
	}
}
class DList
{
	public dnode tail,head;
	public DList()
	{
		head=tail=null;
	}
	public boolean isEmpty()
	{
		return(tail==null);
	}
	void insertFront(int x)
	{
		dnode temp=new dnode(x);
		if(tail==null)
			head=tail=temp;
		else
		{
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}
	void insertLast(int x)
	{
		dnode temp=new dnode(x);
		if(head==null)
			head=tail=temp;
		else
		{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	int deleteFront()
	{
		if(head==null)
			return -1;
		else if(head==tail)
		{
			int x=head.info;
			head=tail=null;
			return x;
		}
		else
		{
			int x=head.info;
			head=head.next;
			head.prev=null;
			return x;
		}
	}
	int deleteLast()
	{
		if(head==null)
			return -1;
		else if(head==tail)
		{
			int x=tail.info;
			head=tail=null;
			return x;
		}
		else
		{
			int x=tail.info;
			tail=tail.prev;
			tail.next=null;
			return x;
		}
	}
	void display()
	{
		dnode t=head;
		while(t!=null)
		{
			System.out.print(""+t.info+" ");
			t=t.next;
		}
		System.out.println("");
	}
	int count()
	{
		int c=0;
		dnode t=head;
		while(t!=null)
		{
			t=t.next;
			c++;
		}
		return c;
	}
	int search(int key)
	{
		dnode t=head;
		int c=1;
		if(head==null)
			return -1;
		else
		{
			while(t!=null)
			{
				if(t.info==key)
					return c;
				else
				{
					c++;
					t=t.next;
					return -1;
				}
			}
			if(t==null)
				return 0;
		}
		
	}
/*	void insertAfter(int x,int y)
	{
		if(head==null)
			System.out.println("No Linked List,Insertion not possible");
		else
		{
			dnode temp=new dnode(y);
			dnode t=head;
			while(t!=null && t.info!=x)
				t=t.next;
			if(t==null)
				System.out.println("Element "+x+" not found,insertion not possible");
			else
			{
				temp.next=t.next;
				t.next=temp;
			}
		}
	}
	void insertBefore(int x,int y)
	{
		if(head==null)
			System.out.println("No Linked List,Insertion not possible");
		else
		{
			dnode temp=new dnode(y);
			dnode t=head;
			if(head.info==x)
			{
				temp.next=head;
				head=temp;
			}
			else
			{
				while(t!=null && t.info!=x)
					t=t.next;
				if(t==null)
					System.out.println("Element "+x+" not found,insertion not possible");
				else
				{
					temp.next=t.next;
					t.next=temp;
				}
			}
		}
	}
	int deleteElement(int key)
	{
		if(head==null)
			return -1;
		else if(head==tail)
		{
			if(head.info==key)
			{
				int x=head.info;
				head=tail=null;
				return x;
			}
			else
				return -1;
		}
		else
		{
			dnode t=head;
			while(t!=null && t.next.info!=key)
				t=t.next;
			if(t==null)
			{
				System.out.println("Element "+key+" not found,deletion not possible");
				return 0;
			}
			else
			{
				int x=t.next.info;
				t.next=t.next.next;
				return x;
			}
		}
	}*/
}
public class doubleLL 
{
	public static void main(String[] args) 
	{
		DList d=new DList();
		int e,option;
		String c;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println(" 1.insert front\n 2.insert last\n 3.delete front\n 4.delete last\n 5.Display\n 6.count\n 7.search\n Enter option:");
			option=s.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Element");
				e=s.nextInt();
				d.insertFront(e);
				break;
			case 2:
				System.out.println("Enter Element");
				e=s.nextInt();
				d.insertLast(e);
				break;
			case 3:
				if(d.deleteFront()==-1)
					System.out.println("Linked List does not exist");
				else
					System.out.println(d.deleteFront());
				break;
			case 4:
				if(d.deleteLast()==-1)
					System.out.println("Linked List does not exist");
				else
					System.out.println(d.deleteLast());
				break;
			case 5:
				d.display();
				break;
			case 6:
				System.out.println(d.count());
				break;	
			case 7:
				System.out.println("Enter Key element");
				int key=s.nextInt();
				int x=d.search(key);
				if(x==-1)
					System.out.println("Linked List does not exist");
				else if(x==0)
					System.out.println("Element not found");
				else
					System.out.println("Element found at position:"+x);
			default:
				System.out.println("Invalid Input");
				break;
			}	
			System.out.println("Do you want to continue?y/n");
			c=s.next();	
			
		}while(c!="n");
	}

}
