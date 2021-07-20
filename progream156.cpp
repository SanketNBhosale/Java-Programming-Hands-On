#include<iostream>
using namespace std;

class Stack
{
private:
    int *Arr;
    int iSize;
    int iTop;
    
public:
    Stack(int);
    ~Stack();
    void Push(int);
    int Pop();
    void Display();
};

Stack :: Stack(int iNo)
{
    iSize = iNo;
    iTop = -1;
    Arr = new int[iSize];
}

Stack :: ~Stack()
{
    delete []Arr;
}
void Stack::Push(int iNo)
{
        if(iTop == iSize -1)
        {
            cout<<"Stack is full\n";
        }
        else
        {
            iTop++;
            Arr[iTop] = iNo;
        }
}

int Stack:: Pop()
{
    if(iTop == -1)
    {
        cout<<"Stack is empty\n";
        return -1;
    }
    else
    {
        int iNo = Arr[iTop];
        iTop--;
        return iNo;
    }
}
void Stack::Display()
{
        if(iTop == -1)
        {
            cout<<"Stack is empty\n";
        }
        else
        {
            for(int i = 0; i <= iTop; i++)
            {
                cout<<Arr[i]<<"\t";
            }
            cout<<"\n";
        }
}

int main()
{
    int iNo = 0, iRet = 0, iChoice=1,iValue=0;
    cout<<"Enter the size of array\n";
    cin>>iNo;
    Stack obj(iNo);
    while(iChoice!=0)
    {
    	cout<<"Please Enter Choice :\n";
    	cout<<"1 :To Push Element\n";
    	cout<<"2 :To Pop Element\n";
    	cout<<"3 :To Display Elements\n";
    	cout<<"0 :To Exit Application\n";
    	cin>>iChoice;
    	switch(iChoice)
    	{
    		case 1:
    			cout<<"Enter Element:\n";
    			cin>>iValue;
    			obj.Push(iValue);
    			break;
    		case 2:
    			iRet = obj.Pop();
    			cout<<"Poped element is : "<<iRet<<"\n";
    			break;
    		case 3:
    			obj.Display();
    			break;
    		case 0:
    			cout<<"Thank you for using Application\n";
    			break;
    		default:
    			cout<<"please enter valid Choice\n";
    			break;

    	}
    }
    
    return 0;
}
