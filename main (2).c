#include<stdio.h>
#include<conio.h>
int main()
{
	int fact=1,num;
	printf("\n enter the number");
	scanf("%d",&num);
	if(num==0)
	fact=1;
	else
	{
		for(int i=1;i<=num;i++)
		fact=fact*i;
	}
	printf("\n Factorial of %d is %d,num,fact");
	return 0;
}
