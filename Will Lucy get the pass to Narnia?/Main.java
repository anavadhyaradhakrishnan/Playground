#include<iostream>
int main()
{
  int x,y,Menu;
  std::cin>>x>>y>>Menu;
  std::cout<<"Enter first number : "<<"Enter second number :"<<" Menu";
  std::cout<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder";
  switch(Menu)
  {
    case 1:std::cout<<"\n"<<x+y;
    break;
    case 2:std::cout<<"\n"<<x-y;
    break;
    case 3:std::cout<<"\n"<<x*y;
    break;
    case 4:std::cout<<"\n"<<x/y;
    break;
    case 5:std::cout<<"\n"<<x%y;
    break; 
    case 6:std::cout<<"\n"<<"Invalid operation";
    break;
  }
 
}