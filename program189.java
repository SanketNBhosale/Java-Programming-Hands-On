import java.util.*;
class Digits
{
	int GetRoot(int iNo)
	{
		int iDigit=0,iSum=iNo;
		while(iSum>9)
		{
			iNo=iSum;
			iSum=0;
			while(iNo!=0)
			{
				iSum=iSum+(iNo%10);
				iNo=iNo/10;
			}
		}
		return iSum;
	}
}
public class program189
{
	public static void main(String arg[])
	{
		int iNo=0,iRet=0;
		System.out.println("Enter Number");
		Scanner sobj=new Scanner(System.in);
		iNo=sobj.nextInt();
		Digits obj=new Digits();
		iRet=obj.GetRoot(iNo);
		System.out.println("Generic Root is :"+iRet);
	}
}