import br.com.alura.screenmatch.modelo.IdadePessoa;

import java.util.ArrayList;

public class NovaPessoa {
    public static void main(String[] args) {
        IdadePessoa novaPessoa = new IdadePessoa();

        novaPessoa.setNome("robson");
        novaPessoa.setIdade(19);


        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("jose");
        pessoa1.setIdade(23);
        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("RObinho");
        pessoa2.setIdade(23);



        novaPessoa.verificaIdade();
        ArrayList<IdadePessoa> listaDePessoas = new ArrayList();
        listaDePessoas.add(novaPessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.toString());





    }

}
