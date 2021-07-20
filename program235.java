import Marvellous.MarvellousArray;
import Marvellous.MarvellousSearch;
import java.util.*;
class Searching extends MarvellousArray
{
	public Searching(int iSize)
	{
		super(iSize);
	}
	private boolean SearchLinear(int iNo)
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

	private boolean SearchBidirectional(int iNo)
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

	public boolean BinarySearch(int iNo)
	{
		int iStart=0;
		int iEnd=Arr.length-1;
		int iMid=iStart+iEnd/2;
		if(Arr[iStart]>iNo || Arr[iEnd]<iNo)
		{
			return false;
		}
		while(iStart<=iEnd)
		{
			if(Arr[iMid]==iNo)
			{
				break;
			}
			else
			{
				if(iNo<Arr[iMid])
				{
					iEnd=iMid+1;
				}
				else
				{
					iStart=iMid-1;
				}
				iMid=iStart+iEnd/2;
			}
		}
		if(Arr[iMid]==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean Search(int iNo)
	{
		if(Sorted==true)
		{
			return (BinarySearch(iNo));
		}
		else
		{
			return (SearchBidirectional(iNo));
		}
	}
}
class program235
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int No=sobj.nextInt();
		Searching obj=new Searching(No);
		obj.Accept();
		obj.Display();
		System.out.println("Enter number :");
		int iNo=sobj.nextInt();
		boolean bRet=obj.Search(iNo);
		if(bRet==true)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}