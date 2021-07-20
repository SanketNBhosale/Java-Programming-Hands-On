import java.util.*;
class StringX
{
	public int CountCapital(String str)
	{
		int iCnt=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A') && (arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
public class program194
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sobj.nextLine();
		StringX obj=new StringX();
		iRet=obj.CountCapital(str);
		System.out.println("Count of Capital  :"+iRet);

	}
}