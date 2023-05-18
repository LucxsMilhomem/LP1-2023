public class pedidos {

    public Clientes cliente;
    public String produto;
    public double valor;
    public int codigo;

    public pedidos(Clientes cliente, String produto, double valor, int codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public void apresentar(){
        System.out.println("Cliente: " + cliente.getNome() + "; Produto: " + this.produto + "; Valor: R$" + this.valor + "; Código: " + this.codigo);
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
