#include<iostream>
int swap(int x,int y)
{
 x=x+y;
 y=x-y;
 x=x-y;
 std::cout<<"After swapping a= "<<x<<" and b="<<y;
}
int main()
{
int a,b;
std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a <<" and b="<<b<<"\n";
  swap(a,b);
  return 0;
}