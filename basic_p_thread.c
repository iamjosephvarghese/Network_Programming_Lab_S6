#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>

void *sampleFunc()
{
	printf("hello\n");
}

void main()

{
	int i;
	pthread_t thread_id;
	for(i=0;i<3;i++)
		pthread_create(&thread_id,NULL,sampleFunc,NULL);
	pthread_join(thread_id,NULL);
}
