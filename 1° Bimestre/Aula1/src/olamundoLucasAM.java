import java.util.Scanner;

public class olamundoLucasAM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("ola mundo");
        System.out.println("ola mundo");

        int idade=11;

        System.out.println("a idade é " + idade + " anos");

        if(idade >= 18){
            System.out.println("é maior de idade");
        }
        else if (idade >= 12){
            System.out.println("é adolescente");
        }
        else {
            System.out.println("é criança");
        }

        int opcao = 7;

        switch (opcao){
            case 1:
                System.out.println("opção 1");
                break;
            case 2:
                System.out.println("opção 2");
                break;
            case 3:
                System.out.println("opção 3");
                break;
            default:
                System.out.println("erro");
        }

        String nomet = "pedro";

        switch (nomet){
            case "roberto":
                System.out.println(nomet + " é professor");
                break;
            case "pedro":
                System.out.println(nomet + " é aluno");
                break;
            default:
                System.out.println(nomet + " não existe no sistema");
        }

        System.out.println("\nteste 1:\n");
        int j=0;
        while(j<10){
            System.out.println("contador: " + j);
            j++;
    }

        System.out.println("\nteste 2:\n");

        for(int i=0; i<10; i++){
            System.out.println("contador: " + i);
        }

        String[] nomes = {
                "Rato",
                "Galoppo",
                "Calleri",
                "Luciano"
        };

        for(String nome : nomes) {
            if (nome == "Calleri" || nome== "Luciano"){
                System.out.println("Professor: " + nome);
            }
            else {
                System.out.println("Aluno(a): " + nome);
            }

        }

        String texto = scanner.nextLine();
        System.out.println("foi digitado: " + texto);
    }
}
