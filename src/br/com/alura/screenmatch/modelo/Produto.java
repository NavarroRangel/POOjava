package br.com.alura.screenmatch.modelo;

public class Produto {
        private String nome;
        private  double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public  double aplicaDesconto (double porcentagem){
        preco = preco * (1 - porcentagem);
        return  preco;
    }
}

