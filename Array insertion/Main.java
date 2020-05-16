#include <iostream> 
using namespace std; 
int main()
{
	int arr[50], size, insert, i, pos1,pos2;
	cout<<"Enter the number of elements in the array"<<endl;
	cin>>size;
	cout<<"Enter the elements in the array"<<endl;
	for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
	cout<<"Enter the location where you wish to insert an element"<<endl;
	cin>>pos1;
    pos2=pos1-1;
    if(pos2>size)
    {
      cout<<"Invalid Input"<<endl;
    }
    else
    {
	  cout<<"Enter the value to insert"<<endl;
	  cin>>insert;
	// now create a space at the required position
	  for(i=size; i>pos2; i--)
	  {
		  arr[i]=arr[i-1];
	  }
        arr[pos2]=insert;
	    cout<<"Array after insertion is"<<endl;
	    for(i=0; i<size+1; i++)
	    {
		    cout<<arr[i]<<endl;
	    }
    }
	    return 0;
}
