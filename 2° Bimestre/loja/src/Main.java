public class Main {
    public static void main(String[] args) {

        Loja Loja = new Loja("Giga");

        Clientes cliente1 = new Clientes("flavia", "398.216.587-10", "(11)98462-1379");
        Clientes cliente2 = new Clientes("barcos", "493.156.754-01", "(11)98493-7968");
        Clientes cliente3 = new Clientes("camila", "532.145.123-29", "(15)92465-6357");

        pedidos pedido1 = new pedidos(cliente1, "prato", 50.00, 100);
        pedidos pedido2 = new pedidos(cliente2, "banana", 32.00, 562);
        pedidos pedido3 = new pedidos(cliente3, "fritas", 8.00, 112);

        Loja.addCliente(cliente1);
        Loja.addCliente(cliente2);
        Loja.addCliente(cliente3);
        Loja.addPedido(pedido1);
        Loja.addPedido(pedido2);
        Loja.addPedido(pedido3);

        System.out.println("Nome da Loja: " + Loja.getNome() + "\n");
        Loja.listacliente();
        Loja.listapedido();

    }
}
