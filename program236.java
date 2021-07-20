import Marvellous.MarvellousArray;
import java.util.*;
public class Sort extends MarvellousArray
{
	public Sort(int iSize)
	{
		super(iSize);
	}
	public void BubbleSort()
	{
		int n=Arr.length;
		int i, j, temp;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n-i-1; j++)
			{
				if( Arr[j] > Arr[j+1])
				{
					temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}
			}
		}
	}

	public void insertionSort()
	{
		int n=Arr.length;
		int i, key, j;
		for (i = 1; i < n; i++)
		{
			key = Arr[i];
			j = i-1;
			while (j >= 0 && Arr[j] > key)
			{
				Arr[j+1] = Arr[j];
				j = j-1;
			}
			Arr[j+1] = key;
		}
	}

	public void SelectionSort()
	{
		int n=Arr.length;
		int index_of_min = 0;
		for(int x=0; x<n; x++)
		{
			index_of_min = x;
			for(int y=x; y<n; y++)
			{
				if(Arr[index_of_min]>Arr[y])
				{
					index_of_min = y;
				}
			}
			int temp = Arr[x];
			Arr[x] = Arr[index_of_min];
			Arr[index_of_min] = temp;
		}
	}
}
class program236
{
	public static void main(String arg[])
	{
		
	}
}