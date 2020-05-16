#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and "<<"b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and "<<"b="<<b;
  return 0;
}
void swap(int &c,int &d)
{
  int temp=c;
  c=d;
  d=temp;
}