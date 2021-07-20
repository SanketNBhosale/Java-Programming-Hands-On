import java.util.*;

class Array
{
	int SumPerfect(int Arr[])
	{
		int iSum=0,iResult=0;
		for(int i=0;i<Arr.length;i++)
		{
			iSum=0;
			for(int j=1;j<=(Arr[i]/2);j++)
			{
				if(Arr[i]%j==0)
				{
					iSum=iSum+j;
				}
			}
			if(iSum==Arr[i])
			{
				iResult=iResult+Arr[i];
			}
		}
		return iResult;
	}
	void Accept(int Arr[])
	{
		System.out.println("Enter Elements :");
		Scanner sobj=new Scanner(System.in);
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}

}
public class program192
{
	public static void main(String arg[])
	{
		int iLength=0,iRet=0;
		System.out.println("Enter Number of Elements :");
		Scanner sobj=new Scanner(System.in);
		iLength=sobj.nextInt();
		int arr[]=new int[iLength];
		Array obj=new Array();
		obj.Accept(arr);
		iRet=obj.SumPerfect(arr);
		System.out.println("Sum of Perfect Numbers is :"+iRet);
	}
}