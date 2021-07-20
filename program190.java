import java.util.*;
class Digits
{
	boolean Amstrong(int iNo)
	{
		int iDigit=0,iCnt=0,iPower=0,iSum=0;
		int iTemp=iNo;
		while(iTemp!=0)
		{
			iTemp=iTemp/10;
			iCnt++;
		}
		iTemp=iNo;
		while(iTemp!=0)
		{
			iDigit=iTemp%10;
			for(int i=1;i<=iCnt;i++)
			{
				iPower=iPower*iDigit;
			}
			iSum=iSum+iPower;
			iPower=1;
			iTemp=iTemp/10;
		}
		if(iSum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
public class program190
{
	public static void main(String arg[])
	{
		int iNo=0;
		boolean bRet;
		System.out.println("Enter Number");
		Scanner sobj=new Scanner(System.in);
		iNo=sobj.nextInt();
		Digits obj=new Digits();
		bRet=obj.Amstrong(iNo);
		if(bRet==true)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}
}