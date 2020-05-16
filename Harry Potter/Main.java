#include<iostream>
using namespace std;
int main()
{
  int n,first,last;
  std::cin>>n;
  first=n/1000;
  last=n%10;
  std::cout<<first+last;
  return 0;
}