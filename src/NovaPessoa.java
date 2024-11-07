import br.com.alura.screenmatch.modelo.IdadePessoa;

public class NovaPessoa {
    public static void main(String[] args) {
        IdadePessoa novaPessoa = new IdadePessoa();

        novaPessoa.setNome("robson");
        novaPessoa.setIdade(19);

        novaPessoa.verificaIdade();

    }
}
