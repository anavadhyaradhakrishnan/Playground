#include<iostream>
int main()
{
    int i,fact=1,n;
    std::cin>>n;
    for(i=1;i<n;i++)
    {
        fact=fact*i;
    }
    std::cout<<fact*i;
}