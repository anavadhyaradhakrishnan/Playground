#include<iostream>
int main()
{
  int x,y;
  std::cin>>x>>y;
  if(x==y)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if (x>y)
  {
    std::cout<<"Yes, you can enter.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}