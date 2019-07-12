#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f%f",&a,&b);
  float res,r;
  res=((a*a)+(b*b));
  r=sqrt(res);
  printf("%.2f",(float)r);
  //Type your code here
  return 0;
}