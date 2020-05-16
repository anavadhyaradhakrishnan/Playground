#include<iostream>
using namespace std;
int main()
{
  int n, x=0;
  std::cin>>n;
  int p[n], Si[n];
  Si[0]=1;
  for (int i=0; i<n; i++)
    std::cin>>p[i];
  for (int i=1; i<n; i++)
  {
    if (p[i-1]<=p[i])
    { 
    for (int j=i; j>0; j--)
    {
    	if (p[j-1]<=p[i])
        {
    	   x=x+2;
           break;
        }
    	else
		   break;  
	}
    Si[i]=x;
    }
    else
      Si[i]=1;
  }
  
  for (int i=0; i<n; i++)
    std::cout<<Si[i]<<"\n";
}