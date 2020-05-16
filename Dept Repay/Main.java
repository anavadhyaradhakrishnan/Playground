#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,d;
  std::cin>>p>>r>>t;
  i=p*r*t/100;
  d=i*0.02;
  std::cout<<i;
  std::cout<<"\n"<<p+i;
  std::cout<<"\n"<<d;
  std::cout<<"\n"<<p+i-d;
  return 0;
}