import java.util.Scanner;

public class primeiroTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("o seu nome é " + nome);

        System.out.println("Qual o sua idade?");
        int age= Integer.parseInt(scanner.nextLine());
        System.out.println("o sua idade é " + age + " anos.");

        if(age >= 60){
            System.out.println("é idoso");
        }
        else if(age >= 18){
            System.out.println("é adulto");
        }
        else if (age >= 12){
            System.out.println("é adolescente");
        }
        else if (age >= 4){
            System.out.println("é criança");
        }
        else{
            System.out.println("é bebê");
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

        System.out.println("\nQual o seu nome?");
        String nomet = scanner.nextLine();

        switch (nomet){
            case "roberto":
                System.out.println("\n" + nomet + " é professor");
                break;
            case "pedro":
                System.out.println("\n" + nomet + " é aluno");
                break;
            default:
                System.out.println("\n" + nomet + " não existe no sistema");
        }

        }

    }
