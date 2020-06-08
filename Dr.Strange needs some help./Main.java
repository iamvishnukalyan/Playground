#include<iostream>
using namespace std;
int power(int x, int y) {  
   int i,power=1;
   if(y == 0)
      return 1;
   for(i=1;i<=y;i++)
      power=power*x;
   return power;}
int main()
{
int m,n,r,a;
std::cin>>m>>n>>r;
a=power(m,n);
if(r<=a)
{
std::cout<<"Doctor, you can proceed with your experiment.";}
else
{std::cout<<"Sorry Doctor! You need more bacteria.";}
return 0;}