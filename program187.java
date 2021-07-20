/*
1 1 1 1 1
3       3
5       5
7       7
9 9 9 9 9
*/
import java.util.*;
class Pattern
{
	void Display(int Row,int Col)
	{
		int i=0,j=0,iNo=1;
		for(i=1;i<=Row;i++)
		{
			for(j=1;j<=Col;j++)
			{
				if((i==1)||(j==1)||(i==Row)||(j==Col))
				{
					System.out.print(iNo);
				}
				else
				{
					System.out.print(" ");
				}
			}
			iNo=iNo+2;
			System.out.println();

		}
	}
}
class program187
{
	public static void main(String arg[])
	{
		int iRow=0;
		int iCol=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of Rows :");
		iRow=sobj.nextInt();
		System.out.println("Enter number of columns:");
		iCol=sobj.nextInt();
		Pattern obj=new Pattern();
		obj.Display(iRow,iCol);
	}
}