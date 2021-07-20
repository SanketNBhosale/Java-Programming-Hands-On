import java.util.*;
class program184
{
	public static void main(String arg[])
	{
		int ans=0;
		int iNo1=0;
		int iNo2=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number :");
		iNo1=sobj.nextInt();
		System.out.println("Enter Second Number :");
		iNo2=sobj.nextInt();
		ans = iNo1+iNo2;
		System.out.println("Addition is :"+ans);
	}
}