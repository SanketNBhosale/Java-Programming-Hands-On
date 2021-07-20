import java.util.*;
class Mathematics
{
	int Addition(int iNo1,int iNo2)
	{
		int ans=0;
		ans=iNo1+iNo2;
		return ans;
	}
}
class program186
{
	public static void main(String arg[])
	{
		int iRet=0;
		int iNo1=0;
		int iNo2=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number :");
		iNo1=sobj.nextInt();
		System.out.println("Enter Second Number :");
		iNo2=sobj.nextInt();
		Mathematics aobj=new Mathematics();
		iRet=aobj.Addition(iNo1,iNo2);
		System.out.println("Addition is :"+iRet);
	}
}