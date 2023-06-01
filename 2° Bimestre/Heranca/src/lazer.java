public class lazer extends gastos{
    private boolean importante;

    public lazer(String nome, double valorInicial, boolean importante) {
        super(nome, valorInicial);
        this.importante=importante;
    }

    public boolean getImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    @Override
    public void mudarValor(double valor){
        super.mudarValor(valor+(0.05*valor));
    }
}
