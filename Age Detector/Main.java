#include<iostream>
using namespace std;
int main()
{
  int x,y;
  int a,b;
  std::cin>>x>>y;
  if(x>y)
  {
    a=1900+x;
    b=2000+y;
    std::cout<<b-a;
  }
  else 
  {
    std::cout<<y-x;
  }
  return 0; 
}