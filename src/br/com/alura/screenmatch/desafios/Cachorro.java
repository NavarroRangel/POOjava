package br.com.alura.screenmatch.desafios;

public class Cachorro extends Animal{
    private String raca;
    private String corDoPelo;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public static void main(String[] args) {
        Cachorro novoCachorro = new Cachorro();
        novoCachorro.setCorDoPelo("Azul");
        novoCachorro.setNome("Jorgin");
        Animal animal = (Animal) novoCachorro;

        System.out.println(animal);
    }
}
