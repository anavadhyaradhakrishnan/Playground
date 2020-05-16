#include<iostream>
using namespace std;
int main()
{
 int num=0,days,cycle=50;
  float sqroot=1;
  std::cin>>num;
  while(cycle>0)
  {
    sqroot=(sqroot+(num/sqroot))/2;
    --cycle;
  }
  days=num+(int(sqroot)+1);
  std::cout<<int(days);
  return 0;
}