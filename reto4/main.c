#include <stdio.h>
#include <stdlib.h>
#define CANT_MAX 50
int main()
{
    char matriz[CANT_MAX][CANT_MAX];
    int nroEscalones,espacios,j=0;
    printf("INGRESE NRO DE ESCALONES\n");
    fflush(stdin);
    scanf("%i",&nroEscalones);
    if(nroEscalones==0){
        matriz[0][0]='_';
        matriz[0][1]='_';
        printf("%c",matriz[0][0]);
        printf("%c",matriz[0][1]);
    }else{
        if(nroEscalones>0){
                espacios=(nroEscalones*2);
                for(int i=0; i<nroEscalones+1; i++){
                    while(j<espacios){
                        matriz[i][j]=' ';
                        j++;
                    }
                    matriz[i][j]='_';
                    if(!(i==0)){
                        matriz[i][j+1]='|';
                    }else{
                        matriz[i][j+1]='\0';
                    }
                    j=0;
                    espacios-=2;
                }

                j=0;
                for(int i=0; i<nroEscalones+1; i++){
                        while(matriz[i][j]!='|'&& (!(i==0 && j==(nroEscalones*2))) ){
                            printf("%c",matriz[i][j]);
                            j++;
                        }
                        printf("%c",matriz[i][j]);
                        printf("%c",'\n');
                        j=0;

                }
                  printf("%c",'\n');
        }
        if(nroEscalones<0){
            nroEscalones*=-1;
             espacios=-1;
            for(int i=0; i<nroEscalones+1; i++){
                while(j<espacios && !(i==0)){
                    matriz[i][j]=' ';
                    j++;
                }
                if(i==0){
                    matriz[i][j]='_';
                }else{
                    matriz[i][j]='|';
                    matriz[i][j+1]='_';
                }
                j=0;
                espacios+=2;
            }

                j=0;
                for(int i=0; i<nroEscalones+1; i++){
                    while(matriz[i][j]!='_'){
                        printf("%c",matriz[i][j]);
                        j++;
                    }
                    printf("%c",matriz[i][j]);
                    printf("%c",'\n');
                    j=0;
                }
        }
    }
    return 0;
}

