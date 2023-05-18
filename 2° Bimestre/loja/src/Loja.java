import java.util.ArrayList;
import java.util.List;
public class Loja {
    private String nome;
    List<Clientes> clientes = new ArrayList<Clientes>();
    List<pedidos> pedidos = new ArrayList<pedidos>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public void addCliente(Clientes cliente){
        this.clientes.add(cliente);
    }

    public void addPedido(pedidos pedido){
        this.pedidos.add(pedido);
    }

    public void listacliente() {
        System.out.println("Lista de Clientes:\n");
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).apresentar();
            System.out.println(" ");
        }
    }

    public void listapedido() {
        System.out.println("Lista de Pedidos:\n");
        for (int i = 0; i < pedidos.size(); i++) {
            pedidos.get(i).apresentar();
            System.out.println(" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
