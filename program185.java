import java.util.*;
class program185
{
	public static void main(String arg[])
	{
		static int Addition(int iNo1,int iNo2)
		{
			return iNo1+iNo2
		}
		int iRet=0;
		int iNo1=0;
		int iNo2=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number :");
		iNo1=sobj.nextInt();
		System.out.println("Enter Second Number :");
		iNo2=sobj.nextInt();
		iRet=Addition(iNo1,iNo2);
		System.out.println("Addition is :"+iRet);
	}
}