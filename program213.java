import java.util.*;
import Marvellous.Matrix;
class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}

	void Forest()
	{
		for(int i = 1; i< Arr.length-1; i++)
		{
			for(int j = 1; j < Arr[i].length-1; j++)
			{
				if(Arr[i][j] == Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j+1]+Arr[i+1][j+1]+Arr[i+1][j]+Arr[i+1][j-1]+Arr[i][j-1])
				{
					System.out.println("Forest element is : "+Arr[i][j]);
				}	
			}
		}
	}

}
class program213
{
	public static void main(String str[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int row=sobj.nextInt();
		System.out.println("Enter Number of Columns: ");
		int col=sobj.nextInt();
		Demo dobj=new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		dobj.Forest();
		System.gc();

	}
}  