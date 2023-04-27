import java.util.Scanner;

public class jdv {
    public static void main(String[] args) {
        char[][] tabu = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

//        while (!vitx(tabu) || !vito(tabu)) {
            instru();
            exibirTabu(tabu);
            jogarx(tabu);
            jogaro(tabu);
//        }

    }
    public static boolean vitx(char[][] tabu){

        for (int i=0; i<3; i++){
            for (int j=0; i<3; j++){
            }
        }
        if (tabu[0][0]=='X' && tabu[0][1]=='X' && tabu[0][2]=='X'){
            return true;
        }
        if (tabu[1][0]=='X' && tabu[1][1]=='X' && tabu[1][2]=='X'){
            return true;
        }
        if (tabu[2][0]=='X' && tabu[2][1]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][0]=='X' && tabu[1][0]=='X' && tabu[2][0]=='X'){
            return true;
        }
        if (tabu[0][1]=='X' && tabu[1][1]=='X' && tabu[2][1]=='X'){
            return true;
        }
        if (tabu[0][2]=='X' && tabu[1][2]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][0]=='X' && tabu[1][1]=='X' && tabu[2][2]=='X'){
            return true;
        }
        if (tabu[0][2]=='X' && tabu[1][1]=='X' && tabu[2][0]=='X'){
            return true;
        }


        return false;
    }
    public static boolean vito(char[][] tabu){

        for (int i=0; i<3; i++){
            for (int j=0; i<3; j++){
            }
        }
        if (tabu[0][0]=='O' && tabu[0][1]=='O' && tabu[0][2]=='O'){
            return true;
        }
        if (tabu[1][0]=='O' && tabu[1][1]=='O' && tabu[1][2]=='O'){
            return true;
        }
        if (tabu[2][0]=='O' && tabu[2][1]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][0]=='O' && tabu[1][0]=='O' && tabu[2][0]=='O'){
            return true;
        }
        if (tabu[0][1]=='O' && tabu[1][1]=='O' && tabu[2][1]=='O'){
            return true;
        }
        if (tabu[0][2]=='O' && tabu[1][2]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][0]=='O' && tabu[1][1]=='O' && tabu[2][2]=='O'){
            return true;
        }
        if (tabu[0][2]=='O' && tabu[1][1]=='O' && tabu[2][0]=='O'){
            return true;
        }


        return false;
    }

    public static void instru(){
        System.out.println("para escolher a posição aperte:");
        System.out.println("1 | 2 | 3");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
        System.out.println("7 | 8 | 9");
    }

    public static void exibirTabu(char[][] tabu){
        System.out.println(tabu[0][0] + " | " + tabu[0][1] + " | " + tabu[0][2]);
        System.out.println("---------");
        System.out.println(tabu[1][0] + " | " + tabu[1][1] + " | " + tabu[1][2]);
        System.out.println("---------");
        System.out.println(tabu[2][0] + " | " + tabu[2][1] + " | " + tabu[2][2]);
    }

    public static void jogarx(char[][] tabu){
        Scanner jogx=new Scanner(System.in);
        int jogada=jogx.nextInt();

        if(jogada==1)
            tabu[0][0]='X';

        if(jogada==2)
            tabu[0][1]='X';

        if(jogada==3)
            tabu[0][2]='X';

        if(jogada==4)
            tabu[1][0]='X';

        if(jogada==5)
            tabu[1][1]='X';

        if(jogada==6)
            tabu[1][2]='X';

        if(jogada==7)
            tabu[2][0]='X';

        if(jogada==8)
            tabu[2][1]='X';

        if(jogada==9)
            tabu[2][2]='X';

    }
    public static void jogaro(char[][] tabu){
        Scanner jogo=new Scanner(System.in);
        int jogada=jogo.nextInt();

        if(jogada==1)
            tabu[0][0]='O';

        if(jogada==2)
            tabu[0][1]='O';

        if(jogada==3)
            tabu[0][2]='O';

        if(jogada==4)
            tabu[1][0]='O';

        if(jogada==5)
            tabu[1][1]='O';

        if(jogada==6)
            tabu[1][2]='O';

        if(jogada==7)
            tabu[2][0]='O';

        if(jogada==8)
            tabu[2][1]='O';

        if(jogada==9)
            tabu[2][2]='O';

    }

}
