public class Chamado {
    private int numero;
    private String descricao;

    public Chamado(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Chamado{numero=" + numero + ", descricao='" + descricao + "'}";
    }
}
