#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  std::cin>>x>>y>>z;
  if(y*75+z*30<=x)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";  
  }
}