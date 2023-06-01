public abstract class gastos {
    private String nome;
    double valor;

    public gastos(String nome, double valorInicial) {
        this.nome = nome;
        this.valor = valorInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mudarValor(double novoValor){
        this.valor=novoValor;
    }
}
