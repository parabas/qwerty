#include <stdio.h>
#define STEPS 1000000000

int main()
{
	int i=0;
	double p=2;
	for (i;i<STEPS;i++)
	{
		p*=((double)(((int)((i+2)/2))*2))/(((int)((i+1)/2))*2+1);
	}
	printf("kroki: %d\n",STEPS);
	printf("Pi = %F21",p);
//	getchar();
	return 0;
}
