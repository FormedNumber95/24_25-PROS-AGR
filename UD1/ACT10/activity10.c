#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <signal.h>

void manejador(int signal)
{
    printf("Padre recibe señal...%d\n", signal);
}
int main()
{
    int pid_hijo;
    pid_hijo = fork(); 
    switch (pid_hijo)
    {
    case -1: 
        printf("No se ha podido crear el proceso hijo...\n");
        exit(-1);
        break;
    case 0: 
        sleep(1);
        kill(getppid(), SIGUSR1); 
        sleep(1);
        kill(getppid(), SIGUSR1); 
		sleep(1);
        kill(getppid(), SIGUSR1);
		sleep(1);
		kill(getppid(),SIGKILL);
        exit(0); 
    default: 
        signal(SIGUSR1, manejador); 
        pause(); 
        pause(); 
        pause();
		pause();
        break;
    }
    exit(0);
}
