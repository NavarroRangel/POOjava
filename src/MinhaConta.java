import br.com.alura.screenmatch.modelo.ContaBancaria;

public class MinhaConta {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setNumeroConta(231);
        minhaConta.setSaldo(200.23);
        minhaConta.titular = "navarro";

        System.out.println("Cliente:" + minhaConta.titular + "Numero da conta: " + minhaConta.getNumeroConta() + "seu saldo é: " + minhaConta.getSaldo());
    }
}
