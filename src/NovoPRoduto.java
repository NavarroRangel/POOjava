import br.com.alura.screenmatch.modelo.Produto;

public class NovoPRoduto {
    public static void main(String[] args) {
        Produto NovoProduto = new Produto();

        NovoProduto.setPreco(200);
        System.out.println(NovoProduto.getPreco());
        NovoProduto.aplicaDesconto(0.23);
        System.out.println(NovoProduto.getPreco());

    }

}
