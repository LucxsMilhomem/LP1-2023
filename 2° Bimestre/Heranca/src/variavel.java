public class variavel extends gastos{
    private int tempoMeses;

    public variavel(String nome, double valorInicial, int tempoMeses) {
        super(nome, valorInicial);
        this.tempoMeses = tempoMeses;
    }

    public int getTempoMeses() {
        return tempoMeses;
    }

    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
}
