#include<stdio.h>
int main()
{
  long int i,n,x=0,a;
	scanf("%ld",&n);	
	for(i=0;n!=0;++i)
	{
		a=n%10;
		x=(a)*(pow(2,i))+x;
		n=n/10;
	}
	
	printf("%ld",x);
  //Type your code here
  return 0;
}