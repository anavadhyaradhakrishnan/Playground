#include<iostream>
#include<math.h>
using namespace std;
void bac(int m,int n,int req)
{
  int a=pow(m,n);
  if(a>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  int main()
  {
    int m,n,req,a;
    cin>>m>>n>>req;
    bac(m,n,req);
    return 0;
  }