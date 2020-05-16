#include <iostream>
using namespace std;
int main()
{
    int i,j,k,n,count=0;
    cin>>n;
    for(i=1;i<=n;i++)
    {
        k=1;
        for(j=0;j<i;j++)
        {
            cout << i;
            if(k<i)
            {
                cout<<"*";
                k=k+1;
            }
        }
        cout<<endl;
    }
    for(i=n;i>0;i--)
    {
        k=1;
        for(j=0;j<i;j++)
        {
            cout<<i;
            if(k<i)
            {
                cout <<"*";
                k=k+1;
            }
        }
        cout<<endl;
    }
    return 0;
}
