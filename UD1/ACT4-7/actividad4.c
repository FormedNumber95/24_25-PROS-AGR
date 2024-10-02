#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

void main()
{
    pid_t pid, pid2, pid3;
    pid = fork();
    if (pid == -1)
    {
        printf("No se ha podido crear el proceso hijo...");
        exit(-1);
    }
    if (pid == 0)
    {
        printf("Soy el hijo 1, Mi padre es %d y mi PID es %d\n", getppid(), getpid());
    }
    else
    {
        wait(NULL);
        pid2 = fork();
        if (pid2 == -1)
        {
            printf("No se ha podido crear el proceso hijo...");
            exit(-1);
        }
        if (pid2 == 0)
        {
            printf("Soy el hijo 2, Mi padre es %d y mi PID es %d\n", getppid(), getpid());
        }
        else
        {
            wait(NULL);
            pid3 = fork();
            if (pid3 == -1)
            {
                printf("No se ha podido crear el proceso hijo...");
                exit(-1);
            }
            if (pid3 == 0)
            {
                printf("Soy el hijo 3, Mi padre es %d y mi PID es %d\n", getppid(), getpid());
            }
            else
            {
                wait(NULL);
                printf("Proceso padre %d \n", getpid());
            }
        }
    }
    exit(0);
}