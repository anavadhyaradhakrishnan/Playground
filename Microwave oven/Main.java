#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float b,c,f;
  double d;
  std::cin>>a>>b;
  c=a*b;
  d=(b*50)/100;
  if(a<=2)
    std::cout<<std::fixed<<std::setprecision(2)<<c-d;
  else if (a==3)
    std::cout<<std::fixed<<std::setprecision(2)<<2*b;
  else
    std::cout<<"Number of items is more";
}