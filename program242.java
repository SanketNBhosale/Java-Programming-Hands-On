import java.util.*;
class Node<T>
{
	public T data;
	public Node next;
	public Node(T no)
	{
		this.data=no;
		this.next=null;
	}
}

class SinglyLL<T>
{
	public Node Head;
	private int iSize;

	public SinglyLL()
	{
		this.Head=null;
		this.iSize=0;
	}

	public void InsertFirst(T no)
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

class program242
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		SinglyLL<Integer> obj=new SinglyLL<Integer>();
		obj.InsertFirst(10);
		obj.InsertFirst(20);
		obj.InsertFirst(30);
		obj.Display();
		obj.Count();

	}
}