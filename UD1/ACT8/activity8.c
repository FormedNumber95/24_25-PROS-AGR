#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

void main()
{
    int fd1[2], fd2[2];
    char buffer[30];
    pid_t pid, pid_2, HIJO_pid, HIJO2_pid;
    char saludoAbuelo[] = "Saludo del abuelo";
    char saludoPadre[] = "Saludo de padre";
    char saludoHijo[] = "Saludo del hijo";
    char saludoNieto[] = "Saludo del nieto";
    pipe(fd1);
    pipe(fd2);
    pid = fork();
    if (pid == -1)
    {
        printf("No se ha podido crear el proceso padre...\n");
        exit(-1);
    }
    if (pid == 0)
    {
        pid_2 = fork();
        switch (pid_2)
        {
        case -1:
            printf("No se ha podido crear el proceso hijo...\n");
            exit(-1);
            break;
        case 0:
            close(fd2[1]);
            read(fd2[0], buffer, sizeof(buffer));
            printf("\t\tEl NIETO recibe mensaje del padre: %s\n", buffer);
            printf("\t\tEl NIETO manda un mensaje al HIJO......\n");
            close(fd1[0]);
            write(fd1[1], saludoNieto, sizeof(saludoNieto));
            exit(0);
            break;

        default:
            close(fd1[1]);
            read(fd1[0], buffer, sizeof(buffer));
            printf("\tEl HIJO recibe un mensaje de abuelo: %s\n", buffer);
            printf("\tEl HIJO envia un mensaje al NIETO......\n");
            close(fd2[0]);
            write(fd2[1], saludoPadre, sizeof(saludoPadre));
            HIJO2_pid = wait(NULL);
            close(fd1[1]);
            read(fd1[0], buffer, sizeof(buffer));
            printf("\tEl HIJO recibe un mensaje de su hijo: %s\n", buffer);
            printf("\tEl HIJO envia un mensaje al ABUELO......\n");
            close(fd2[0]);
            write(fd2[1], saludoHijo, sizeof(saludoHijo));
            break;
        }
    }
    else
    {
        printf("El ABUELO envia un mensaje al HIJO......\n");
        close(fd1[0]);
        write(fd1[1], saludoAbuelo, sizeof(saludoAbuelo));
        HIJO_pid = wait(NULL);
        close(fd2[1]);
        read(fd2[0], buffer, sizeof(buffer));
        printf("El ABUELO recibe un mensaje del HIJO: %s\n", buffer);
    }
}
