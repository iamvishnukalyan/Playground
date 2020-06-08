#include<iostream>
int main ()
{
int n, i=1,a, num;
std::cin>>n;  
for(i=1;i<=n;i++){
  if(i%2==0)
 {
  a=2;
}
 else{
   a=1;
 }
 num=i*i-a;
 std::cout<<num<<" ";
}
}