#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

void main()
{
    int n = 5;
    pid_t pid, pidHijo;
    pid = fork();
    if (pid == -1)
    {
        printf("No se ha podido crear el proceso hijo...");
        exit(-1);
    }
    if (pid == 0)
    {
        printf("Soy el hijo 1, Mi padre es %d y mi PID es %d\n", getppid(), getpid());
        for (int i = 1; i < n; i++)
        {
            pid = fork();
            if (pid == -1)
            {
                printf("No se ha podido crear el proceso hijo...");
                exit(-1);
            }
            if (pid == 0)
            {
                printf("Soy el hijo %d, Mi padre es %d y mi PID es %d\n", i + 1, getppid(), getpid());
            }
            else
            {
                wait(NULL);
                exit(0);
            }
        }
    }
    else
    {
        wait(NULL);
        printf("Proceso padre %d \n", getpid());
    }
}