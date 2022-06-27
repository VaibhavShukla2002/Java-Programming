#include<stdio.h>
#include<conio.h>
int main(){
	int num [] = {10,20,30,40,50};
	int i;
	int sum=0;
	for (i=0;i<5;i++){
	sum = sum + num[i];
	}
	printf("\n Sum of elements of array is %d",sum);
	return 0;
}
