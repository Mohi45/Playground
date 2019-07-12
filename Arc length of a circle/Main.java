#include<stdio.h>
int main()
{
float a,r;
scanf("%f%f",&a,&r);
float l=0.0;
l=((a/360)*(2*3.14*r));
printf("%0.2f",l);
return 0;
}