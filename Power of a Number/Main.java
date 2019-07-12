#include <stdio.h>
#include<math.h>
int main()
{
  long int a,b,power;
  scanf("%ld %ld",&a,&b);
  if(b<0)
  {
    printf("Wrong input");
  }
  else
  {
    power=pow(a,b);
    printf("%ld",power);
  }
  	//Your code here       
    return 0;
}