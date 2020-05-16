#include<iostream>
int main()
{
  int i,j,n;
  std::cin>>n;
  j=11;
  for(i=0;i<n;i++)
  {
    
    std::cout<<j*j<<" ";
    j= j+4;
  }
}