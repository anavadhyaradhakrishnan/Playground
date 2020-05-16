#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,c;
  int i,t;
  std::cin>>a>>b>>c;
  int sum=6;
  int gp=0,sp=0;
  if(a>b && a>c)
   gp=1;
  else if(b>a && b>c)
   gp=2;
  else
   gp=3; 
  if(a<b && a<c)
   sp=1;
  else if(b<a && b<c)
   sp=2;
  else
   sp=3;
  int x=gp+sp;
  int y=sum-x;
  switch(y)
  {
      case 1:std::cout<<"The treasure is in box which has number "<<a;
      break;
      case 2:std::cout<<"The treasure is in box which has number "<<b;
      break;
      case 3:std::cout<<"The treasure is in box which has number "<<c;
      break;   
  }
  for(i=1;i<=5;i++)
  {
   if(a%i==0 && b%i==0 && c%i==0)
   {
     t=i;
   }
  }
  std::cout<<"\n"<<"The code to open the box is "<<t;
  return 0;
}
