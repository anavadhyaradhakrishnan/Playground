#include<iostream>
using namespace std;
int gcd(int u,int v)
{
  return (v!=0)?gcd(v,u%v):u;
}
int main()
{
  int a,b,result;
  cin>>a>>b;
  result=gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<result;
  return 0;
}