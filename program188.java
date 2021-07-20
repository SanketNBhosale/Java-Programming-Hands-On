import java.util.*;

class Numbers
{
	void Display(int Arr[],int iSize)
	{
		for(int i=0;i<iSize;i++)
		{
			System.out.println(Arr[i]);
		}
	}

}
public class program188
{
	public static void main(String arg[])
	{
		int iLength=0,iRet=0;
		System.out.println("Enter Number of Elements :");
		Scanner sobj=new Scanner(System.in);
		iLength=sobj.nextInt();
		int arr[]=new int[iLength];
		System.out.println("Enter Elements :");
		for(int i=0;i<iLength;i++)
		{
			arr[i]=sobj.nextInt();
		}
		Numbers obj=new Numbers();
		obj.Display(arr,iLength);
	}
}