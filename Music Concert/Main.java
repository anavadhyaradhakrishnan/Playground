#include<iostream>
using namespace std;
int main(){
  int t,i,female=0,male=0;
  cin>>t;
  int arr[t];
  for(i=0;i<t;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<t;i++)
  {
    if(arr[i]%2==0)
    {
      female=female+1;
    }
    else
    {
      male=male+1;
    }
  }
  cout<<male<<endl;
  cout<<female<<endl;
  return 0;
}
