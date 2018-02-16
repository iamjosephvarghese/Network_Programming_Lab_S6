#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>

void *sampleFunc()
{
//	sleep(1);
	printf("hello\n");
}

void main()

{
	int i;
	pthread_t thread_id[3];
	for(i=0;i<3;i++)
	{
		pthread_create(&thread_id[i],NULL,sampleFunc,NULL);
		pthread_join(thread_id[i],NULL);
	}
}
