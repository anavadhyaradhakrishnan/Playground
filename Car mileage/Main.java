#include<iostream>
using namespace std;
int main()
{
  int x,d,y;
  float m;
  std::cin>>m>>x>>d;
  y=m*x;
  if(y>=d)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}