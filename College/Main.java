#include<iostream>
int main()
{ 
struct College
{
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
};
int n,i,j;
std::cout<<"Enter the number of colleges "<<"\n";
std::cin>>n;
struct College stud[n];
j=1;
for(i=0;i<n;i++)
{    
std::cout<<"Enter the details of college "<<j;
std::cout<<"\n"<<"Enter name"<<"\n";
std::cin>>stud[i].name;
std::cout<<"Enter city"<<"\n";
std::cin>>stud[i].city;
std::cout<<"Enter year of establishment"<<"\n";
std::cin>>stud[i].establishmentYear;
std::cout<<"Enter pass percentage"<<"\n";
std::cin>>stud[i].passPercentage;
j++; 
}
j=1;

std::cout<<"Details of colleges";
for(i=0;i<n;i++)
{   
std::cout<<"\n"<<"College:"<<j;
std::cout<<"\n"<<"Name:"<<stud[i].name;
std::cout<<"\n"<<"City:"<<stud[i].city;
std::cout<<"\n"<<"Year of establishment:"<<stud[i].establishmentYear;
std::cout<<"\n"<<"Pass percentage:"<<stud[i].passPercentage;
j++;
}
return 0;
}
