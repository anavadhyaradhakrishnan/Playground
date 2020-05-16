#include<iostream>
#include<bits/stdc++.h>
using namespace std;
bool kp(int n)

{
  if(n==1)
    return true;
  int sqr=n*n;
  int dig=0;
  while(sqr)
  {
    dig++;
    sqr/=10;
  }
  sqr=n*n;
  sqr=n*n;
  for(int rdig=1;rdig<dig;rdig++)
  {
    int eq=pow(10,rdig);
    if(eq==n)
      continue;
    int sum=sqr/eq+sqr%eq;
    if(sum==n)
      return true;
  }
  return false;
}
int main()
{
  int kpno;
  cin>>kpno;
  kp(kpno)?cout<<"Kaprekar Number":cout<<"Not a Kaprekar Number";
  cout<<endl;
  return 0;
}
