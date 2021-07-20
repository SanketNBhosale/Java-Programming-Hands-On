import java.util.*;

class Array
{
	int Sum(int Arr[])
	{
		int iSum=0;
		for(int i=0;i<Arr.length;i++)
		{
			iSum=iSum+Arr[i];
		}
		return iSum;
	}
	void Accept(int Arr[],int iSize)
	{
		System.out.println("Enter Elements :");
		Scanner sobj=new Scanner(System.in);
		for(int i=0;i<iSize;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}

}
public class program191
{
	public static void main(String arg[])
	{
		int iLength=0,iRet=0;
		System.out.println("Enter Number of Elements :");
		Scanner sobj=new Scanner(System.in);
		iLength=sobj.nextInt();
		int arr[]=new int[iLength];
		Array obj=new Array();
		obj.Accept(arr,iLength);
		iRet=obj.Sum(arr);
		System.out.println("Sum of Elements is :"+iRet);
	}
}