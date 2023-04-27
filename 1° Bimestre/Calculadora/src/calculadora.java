import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    int rep=0;

    while(rep==0){

        System.out.println("Qual operação matemática você quer fazer?");
        System.out.println("Use:");
        System.out.println("+ para soma");
        System.out.println("- para subtração");
        System.out.println("* para multiplicação");
        System.out.println("/ para divisão \n");
        char op1 = op.next().charAt(0);

        System.out.println("Qual o primeiro numero da operação?");
        double num1 = op.nextInt();

        System.out.println("\nQual o segundo numero da operação?");
        double num2 = op.nextInt();

        switch (op1) {
            case '+':
                System.out.printf("\nO resultado é: ");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.printf("\nO resultado é: ");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.printf("\nO resultado é: ");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.printf("\nO resultado é: ");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Essa operação é invalida");
        }
        System.out.println("\nVocê quer continuar?(s para SIM, qualquer outra tecla para NÃO)");
        char rep1 = op.next().charAt(0);
           if(rep1!='s'){
               rep++;
           }
        }

    }
}
