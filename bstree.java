class node
{
	int data;
	node left,right;
	public node()
	{
		left=right=null;
	}
	public node(int x)
	{
		data=x;
		left=right=null;
	}
}
class bst
{
	node root;
	bst()
	{
		root=null;
	}
	node insert(node t,int y)
	{
		if(t==null)
		{
			t=new node(y);
		}
		else
		{
			if(y<t.data)
			{
				t.left=insert(t.left,y);
			}
			else
			{
				t.right=insert(t.right,y);
			}
		}
		return t;
	}
	void inorder(node t)
	{
		if(t!=null)
		{
			inorder(t.left);
			System.out.println(t.data);
			inorder(t.right);
		}
		if(root==null)
			System.out.println("No tree detected");
	}
	void preorder(node t)
	{
		if(t!=null)
		{
			System.out.println(t.data);
			preorder(t.left);
			preorder(t.right);
		}
		if(root==null)
			System.out.println("No tree detected");
	}
	void postorder(node t)
	{
		if(t!=null)
		{
			postorder(t.left);
			postorder(t.right);
			System.out.println(t.data);
		}
		if(root==null)
			System.out.println("No tree detected");
	}
	boolean search(node t,int y)
	{
		if(t==null)
		{
			return false;
		}
		else if(t.data==y)
			return true;
		else
		{
			if(y>t.data)
				return search(t.right,y);
			else
				return search(t.left,y);
		}
	}
	void delete(int x)
	{
		node t=root,pt=root;
		//delete root node without any child
		if(root.data==x&&root.left==null&&root.right==null)
			root=null;
		//search for node
		else
		{
			while(t!=null&&t.data!=x)
			{
				if(x>t.data)
				{
					pt=t;
					t=t.right;
				}
				else
				{
					pt=t;
					t=t.left;
				}
			}
		}
		//delete an external node
		if(t==null)
		{
			System.out.println("Element "+x+" not found");
		}
		else
		{
			if(t.data==x&&t.left==null&&t.right==null)
			{
				if(x>pt.data)
					pt.right=null;
				else
					pt.left=null;
			}
		}
		//delete a node with left child only
		if(t.data==x&&t.left!=null&&t.right==null)
		{
			if(x>pt.data)
				pt.right=t.left;
			else
				pt.left=t.left;
		}
		//delete a node with right child only
		if(t.data==x&&t.left==null&&t.right!=null)
		{
			if(x>pt.data)
				pt.right=t.right;
			else
				pt.left=t.right;
		}
		if(t.left!=null&&t.right!=null)
		{
			pt=t;
			//finding inorder predecessor
			node t1=t.left;
			while(t1.right!=null)
			{
				pt=t1;
				t1=t1.right;
			}
			t.data=t1.data;
			if(pt==t)
				pt.left=t1.left;
			else
				pt.right=t1.left;
		}
	}
}
public class bstree
{
	public static void main(String args[])
	{
		bst b=new bst();
		b.root=b.insert(b.root,20);
		b.root=b.insert(b.root,10);
		b.root=b.insert(b.root,40);
		b.inorder(b.root);
		b.delete(10);
		b.inorder(b.root);
		b.preorder(b.root);
		b.delete(20);
		b.inorder(b.root);
		b.preorder(b.root);
	}
}