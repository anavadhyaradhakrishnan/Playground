#include<iostream>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x>>y;
  if(x<=200)
  {
    std::cout<<"Rs."<<x/2;
  }
  else if( x>200 && x<=400)
  {
    std::cout<<"Rs."<<x*.65+100;
  }
  else if( x>400 && x<=600)
  {
    std::cout<<"Rs."<<x*.80+200;
  }
  else
  {
    std::cout<<"Rs."<<x*1.25+425;
  }
}