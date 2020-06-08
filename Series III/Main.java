#include<iostream>
int main ()
{
   int n, i=0,a, num;
   std::cin>>n;
   a=6; 
for(i=0;i<n;i++)
{
   num=5*i+a;
   std::cout<<num<<" ";
   a=num;
}
}