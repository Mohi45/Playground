#include<stdio.h>
int main()
{
 int  search, c, n;
 
  //printf("Enter number of elements in array\n");
  scanf("%d", &n);
 
 // printf("Enter %d integer(s)\n", n);
 int array[n];
  for (c = 0; c < n; c++)
    scanf("%d", &array[c]);
 
  //printf("Enter a number to search\n");
  scanf("%d", &search);
 
  for (c = 0; c < n; c++)
  {
    if (array[c] == search)    /* If required element is found */
    {
      printf("%d", c+1);
			return 0;
    }
  }
//  if (c == n)
    printf("%d isn't present in the array.\n", search);
 
  //Type your code here
  return 0;
}