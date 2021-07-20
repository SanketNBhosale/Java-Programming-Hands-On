import java.util.*;
class Node
{
	public int data;
	public Node next;
	public Node(int no)
	{
		this.data=no;
		this.next=null;
	}
}

class SinglyLL
{
	public Node Head;
	private int iSize;

	public SinglyLL()
	{
		this.Head=null;
		this.iSize=0;
	}

	public void InsertFirst(int no)
	{
		Node newn=new Node(no);
		if(this.Head==null)
		{
			Head=newn;
		}
		else
		{
			Node temp=this.Head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newn;
		}
		this.iSize++;
	}

	public int Count()
	{
		return this.iSize;
	}

	public void InsertLast(int no)
	{
		Node newn=new Node(no);
		if(this.Head==null)
		{
			Head=newn;
		}
		else
		{
			Node temp=this.Head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newn;
		}
	}
	public void DeleteFirst()
	{
		if(this.Head==null)
		{
			return;
		}
		else
		{
			Head=Head.next;
		}
		this.iSize--;
	}
	public void DeleteLast()
	{
		if(this.Head==null)
		{
			return;
		}
		else if(iSize==1)
		{
			Head=null;
		}
		else
		{
			Node temp=this.Head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		this.iSize--;
	}

	public void InsertAtPosition(int no,int ipos)
	{
		if(ipos<1 || ipos>iSize+1)
		{
			return;
		}
		if(ipos==1)
		{
			InsertFirst(no);
		}
		else if(ipos==iSize+1)
		{
			InsertLast(no);
		}
		else
		{
			Node newn=new Node(no);
			Node temp=this.Head;
			for(int i=1;i<ipos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
			iSize++;
		}
	}


	public void DeleteAtPosition(int ipos)
	{
		if(ipos<1 || ipos>iSize)
		{
			return;
		}
		if(ipos==1)
		{
			DeleteFirst();
		}
		else if(ipos==iSize)
		{
			DeleteLast();
		}
		else
		{
			Node temp=this.Head;
			for(int i=1;i<ipos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			iSize--;
		}
	}
	public void Display()
	{
		Node temp=this.Head;
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;
		}
		System.out.println();
	}
}

class program241
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		SinglyLL obj=new SinglyLL();
		obj.InsertFirst(10);
		obj.InsertLast(20);
		obj.InsertFirst(30);
		obj.DeleteAtPosition(2);
		obj.Display();
		obj.Count();

	}
}