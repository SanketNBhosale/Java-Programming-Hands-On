import java.util.*;
class Matrix
{
	void Accept(int Arr[][])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int row=sobj.nextInt();
		System.out.println("Enter Number of Columns: ");
		int col=sobj.nextInt();
		Arr[][]=new int[row][col];
		System.out.println("Enter the elements ;");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	void Display(int Arr[][])
	{
		System.out.println("elements of matrix are:");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

class program201
{
	public static void main(String str[])
	{
		Matrix mobj=new Matrix();
		int arr;
		mobj.Accept(arr);
		mobj.Display(arr);
		Arr=null;

	}
}