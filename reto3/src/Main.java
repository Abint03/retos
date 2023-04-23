import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String puntuaciones[] = {"Love", "15", "30", "40", "Deuce", "Ventaja"};
        String p1[] = new String[50];
        String p2[] = new String[50];
        int a = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        int pl1;
        int pl2;
        int ganador = 0;
        while (ganador == 0) {
            pl1 = scan.nextInt();
            pl2 = scan.nextInt();

            if (pl1 == 1) {
                if (i > 0) {
                    if (p1[i - 1] == puntuaciones[5] || (p1[i-1]==puntuaciones[3] && !(p2[j-1]==puntuaciones[3] || p2[j-1]==puntuaciones[5]))) {
                        System.out.println("PLAYER 1 HA GANADO EL JUEGO");
                        ganador = 1;
                    }
                    if (p1[i - 1] == puntuaciones[3] && p2[j - 1] == puntuaciones[3] && !(p2[j-2]==puntuaciones[5])) {
                            p1[i] = puntuaciones[5];
                            i++;
                    }
                    if(p1[i - 1] == puntuaciones[3] && p2[j - 1] == puntuaciones[5]){
                        p1[i]=puntuaciones[3];
                        i++;
                    }
                }
                if (a == 0) {
                    a++;
                    p1[i] = puntuaciones[a];
                    i++;
                } else if (a == 1) {
                    a++;
                    p1[i] = puntuaciones[a];
                    i++;
                } else if (a == 2) {
                    a++;
                    p1[i] = puntuaciones[a];
                    i++;
                } else {
                    a++;
                }


            } else {
                if (a > 3) {
                    if (p1[i - 1] == puntuaciones[5] && pl2 == 1 || p1[i-1]==puntuaciones[3]) {
                        p1[i] = puntuaciones[3];
                    }
                } else {
                    p1[i] = puntuaciones[a];
                }
                i++;
            }
            if (pl2 == 1) {
                    if (j > 0) {

                        if (p2[j - 1] == puntuaciones[5] || (p2[j-1]==puntuaciones[3] && !(p1[i-1]==puntuaciones[3] || p1[i-1]==puntuaciones[5]))) {
                            System.out.println("PLAYER 2 HA GANADO EL JUEGO");
                            ganador = 1;
                        }
                        if (p1[i - 1] == puntuaciones[3] && p2[j - 1] == puntuaciones[3] && !(p1[i-2]==puntuaciones[5])) {
                            p2[j] = puntuaciones[5];
                            j++;
                        }
                        if(p2[j - 1] == puntuaciones[3] && p1[i - 2] == puntuaciones[5]){
                            p2[j]=puntuaciones[3];
                            j++;
                        }
                    }
                    if (b == 0) {
                        b++;
                        p2[j] = puntuaciones[b];
                        j++;
                    } else if (b == 1) {
                        b++;
                        p2[j] = puntuaciones[b];
                        j++;
                    } else if (b == 2) {
                        b++;
                        p2[j] = puntuaciones[b];
                        j++;
                    } else {
                        b++;

                    }


                } else {
                    if ( b > 3) {
                        if (p2[j - 1] == puntuaciones[5] && pl1 == 1 || p2[j-1]==puntuaciones[3]) {
                            p2[j] = puntuaciones[3];
                        }
                    } else {
                        p2[j] = puntuaciones[b];
                    }
                    j++;
                }
                if (ganador == 0) {

                    if (p1[i - 1] == puntuaciones[5] && !(p2[j - 1] == puntuaciones[5])) {
                        System.out.println("VENTAJA PLAYER 1");
                    }
                    if (p2[j - 1] == puntuaciones[5] && !(p1[i - 1] == puntuaciones[5])) {
                        System.out.println("VENTAJA PLAYER 2");
                    }
                    if ((p1[i - 1] == puntuaciones[3] && p2[j - 1] == puntuaciones[3])) {
                        System.out.println("DEUCE");
                    }
                    if (!(p2[j - 1] == puntuaciones[5]) && !(p1[i - 1] == puntuaciones[3] && p2[j - 1] == puntuaciones[3]) && !(p1[i - 1] == puntuaciones[5])) {
                        System.out.println(p1[i - 1] + " - " + p2[j - 1]);
                    }
                }
            }
        }
    }




