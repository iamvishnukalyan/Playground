#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>b){
  	a = a+1900;
    b = b+2000;
    std::cout<<b-a;
  }
  else{
  	a = a+2000;
    b = b+2000;
    std::cout<<b-a;
  }
}