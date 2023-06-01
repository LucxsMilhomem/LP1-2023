public class Main {
    public static void main(String[] args) {
        fixo conta1 = new fixo("Academia", 120.00);
        fixo conta2 = new fixo("Cortar Cabelo", 40.00);
        fixo conta3 = new fixo("Plano de  Wifi", 80.00);

        lazer laz1 = new lazer("Netflix", 30.00, true);
        lazer laz2 = new lazer("Estádio de Futebol", 20.00, false);

        variavel var1 = new variavel("Tênis", 600.00, 3);
        variavel var2 = new variavel("Cruzeiro do Ney", 6000.00, 12);

        System.out.println("Contas Fixas:");
        System.out.println(conta1.getNome() + ":");
        System.out.println("Valor da Conta:R$" + conta1.getValor() + "\n");
        System.out.println(conta2.getNome() + ":");
        System.out.println("Valor da Conta:R$" + conta2.getValor() + "\n");
        System.out.println(conta3.getNome() + ":");
        System.out.println("Valor da Conta:R$" + conta3.getValor() + "\n");

        System.out.println("Contas de Lazer:");
        System.out.println("Valor Inicial de " + laz1.getNome() + ": R$" + laz1.getValor());
        laz1.mudarValor(laz1.getValor());
        System.out.println("Novo Valor de " + laz1.getNome() + ": R$" + laz1.getValor());

        System.out.println("\nValor Inicial de " + laz2.getNome() + ": R$" + laz2.getValor());
        laz2.mudarValor(laz2.getValor());
        System.out.println("Novo Valor de " + laz2.getNome() + ": R$" + laz2.getValor());

        System.out.println("Contas variáveis:");
        System.out.println("Valor de " + var1.getNome() + ": R$" + var1.getValor());
        System.out.println("Quantidade de parcelas: "+ var1.getTempoMeses());

        System.out.println("\nValor de " + var2.getNome() + ": R$" + var2.getValor());
        System.out.println("Quantidade de parcelas: "+ var2.getTempoMeses());
    }
}