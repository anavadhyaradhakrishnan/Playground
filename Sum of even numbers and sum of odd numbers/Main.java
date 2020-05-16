#include<iostream>
using namespace std;
int main()
{
   int i,n,num[100];
   int odd=0,even=0;
   cin>>n;
   for(i=0;i<n;i++)
    cin>>num[i];
   for(i=0; i<=n; i++)
    {
       if(num[i]%2==0) 
           even=even+num[i];
       else
           odd=odd+num[i];
   }
   cout<<"The sum of the even numbers in the array is "<<even;

   cout<<"\n"<<"The sum of the odd numbers in the array is "<<odd;

   return 0;
}