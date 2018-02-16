#include<stdio.h>
#include<sys/types.h>
void main()
{
	pid_t pid;
	
	pid = fork();
	if(pid == 0)
	{
		printf("Child Process!\n");
	}else{
		printf("hi %d\n",pid);
	}
}
