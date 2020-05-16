#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50],rev[50],temp;
  gets(str);
  gets(rev);
  int j = strlen(str)-1;
  for(int i=0;i<j;i++,j--)
  {
    temp = str[i];
    str[i]=str[j];
    str[j]=temp;
  }

  if(strcmp(str,rev)==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
  return 0;
}