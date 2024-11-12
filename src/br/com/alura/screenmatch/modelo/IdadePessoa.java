package br.com.alura.screenmatch.modelo;

public class IdadePessoa {
    private  String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificaIdade(){
        if(this.idade < 18){
            System.out.println("Você é de Menor");
        } else{
            System.out.println("TU é veio");
        }
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
