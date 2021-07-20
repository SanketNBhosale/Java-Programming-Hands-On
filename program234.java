import Marvellous.MarvellousArray;
import java.util.*;
class Searching extends MarvellousArray
{
	public Searching(int iSize)
	{
		super(iSize);
	}
	public boolean SearchLinear(int iNo)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
				break;
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public boolean SearchBidirectional(int iNo)
	{
		int iStart=0;
		int iEnd=Arr.length-1;
		while(iStart<=iEnd)
		{
			if(Arr[iStart]==iNo || Arr[iEnd]==iNo)
			{
				break;
			}
			iStart++;
			iEnd--;
		}
		if(iStart>iEnd)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
class program234
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int No=sobj.nextInt();
		Searching obj=new Searching(No);
		obj.Accept();
		obj.Display();
		System.out.println("Enter number for Search:");
		int iNo=sobj.nextInt();
		boolean bRet=obj.SearchBidirectional(iNo);
		if(bRet==true)
		{
			System.out.println("Element is There");
		}
		else
		{
			System.out.println("Element is not there");
		}
	}
}