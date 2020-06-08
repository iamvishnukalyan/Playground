#include<iostream>
using namespace std;
int main()
{
int r,l,d;
  std::cin>>r>>l;
  d = r*2;
  if (d>l){
  	std::cout<<"circle cannot be inside a square";
  }
  else
    std::cout<<"circle can be inside a square";
}