#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

void main()
{
    pid_t pid;
    int n = 6;
    printf("Valor inicial de la variable: %d\n", n);
    pid = fork();
    if (pid == -1)
    {
        printf("No se ha podido crear el proceso hijo...");
        exit(-1);
    }
    if (pid == 0)
    {
        n-=5;
        printf("Variable en Proceso Hijo: %d\n",n);
    }
    else
    {
        wait(NULL);
        n+=5;
        printf("Variable en Proceso Padre: %d\n",n);
    }
}