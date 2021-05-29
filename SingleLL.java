
class node
{
	public int info;
	public node next;
	public node(int x)
	{
		info=x;
		next=null;
	}
}
class SList
{
	public node head,tail;
	public SList()
	{
		head=tail=null;
	}
	public boolean isEmpty()
	{
		return(head==null);
	}
	void insertFront(int x)
	{
		node temp=new node(x);
		if(head==null)
			head=tail=temp;
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	void insertLast(int x)
	{
		node temp=new node(x);
		if(head==null)
			head=tail=temp;
		else
		{
			tail.next=temp;
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
			node t=head;
			while(t.next!=tail)
				t=t.next;
			t.next=null;
			tail=t;
			return x;
		}
	}
	void display()
	{
		node t=head;
		while(t!=null)
		{
			System.out.print(""+t.info+" ");
			System.out.println("");
			t=t.next;
		}
	}
	int count()
	{
		int c=0;
		node t=head;
		while(t!=null)
		{
			t=t.next;
			c++;
		}
		return c;
	}
	int search(int key)
	{
		node t=head;
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
	void insertAfter(int x,int y)
	{
		if(head==null)
			System.out.println("No Linked List,Insertion not possible");
		else
		{
			node temp=new node(y);
			node t=head;
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
			node temp=new node(y);
			node t=head;
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
			node t=head;
			while(t!=null && t.next.info!=key)
				t=t.next;
			if(t==null)
			{
				System.out.println("Element "+key+" not found,deletion not possible");
			}
			else
			{
				int x=t.next.info;
				t.next=t.next.next;
				return x;
			}
		}
	}
}
public class SingleLL 
{
	public static void main(String[] args) 
	{
		
	}

}
