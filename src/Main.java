public class Main {
    public static void main(String[] args) {
        testarClientes();
        testarChamados();
        testarPedidos();
    }

    private static void testarClientes() {
        IO.println("=== FILA DE CLIENTES ===");

        Fila<Cliente> fila = new Fila<>();
        fila.adicionar(new Cliente("Ana", "111.111.111-11"));
        fila.adicionar(new Cliente("Carlos", "222.222.222-22"));

        fila.listar();
        IO.println("Primeiro: " + fila.primeiro());
        IO.println("Removido: " + fila.proximo());

        IO.println("Elementos restantes:");
        fila.listar();
        IO.println("Quantidade: " + fila.quantidade());
    }

    private static void testarChamados() {
        IO.println("\n=== FILA DE CHAMADOS ===");

        Fila<Chamado> fila = new Fila<>();
        fila.adicionar(new Chamado(1, "Computador não liga"));
        fila.adicionar(new Chamado(2, "Erro ao acessar o sistema"));

        fila.listar();
        IO.println("Primeiro: " + fila.primeiro());
        IO.println("Removido: " + fila.proximo());

        IO.println("Elementos restantes:");
        fila.listar();
        IO.println("Quantidade: " + fila.quantidade());
    }

    private static void testarPedidos() {
        IO.println("\n=== FILA DE PEDIDOS ===");

        Fila<Pedido> fila = new Fila<>();
        fila.adicionar(new Pedido(101, 150.50));
        fila.adicionar(new Pedido(102, 89.90));

        fila.listar();
        IO.println("Primeiro: " + fila.primeiro());
        IO.println("Removido: " + fila.proximo());

        IO.println("Elementos restantes:");
        fila.listar();
        IO.println("Quantidade: " + fila.quantidade());
    }
}
