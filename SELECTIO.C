#include<stdio.h>
#include<conio.h>
// Selection Sort //
void main()
{
	int a[] = {10,30,50,40,20};
	int i,j,temp;
	clrscr();
	printf("Before sorting Element are : \n");
	for (i=0;i<5;i++)
	{
	  printf("%d\t",a[i]);
	}
	for(i=0;i<4;i++)
	{
	 for(j=(i+1);j<5;j++)
	 {
	  if(a[i]>a[j])
	  {
	   temp=a[i];
	   a[i]=a[j];
	   a[j]=temp;
	  }
	 }
	}
	printf("\n After Sorting\n");
	for(i=0;i<5;i++)
	{
	printf("%d\t",a[i]);
	}
   getch();
}