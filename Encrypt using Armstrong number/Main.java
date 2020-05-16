#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int i,j,r,temp,s,sum=0;
    temp=n;   
j=n; 
while(j>0)
{
  i=j%10;
  s=s+1;
  j=j/10;
}
while(n>0)    
{    
r=n%10;    
sum=sum+power(r,s);    
n=n/10;    
}    
if(temp==sum)    
return 1;  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";   
}