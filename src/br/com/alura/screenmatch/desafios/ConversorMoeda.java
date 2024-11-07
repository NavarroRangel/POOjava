package br.com.alura.screenmatch.desafios;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
    double cotacaoDolar = 5.7;
    double valorReal = valorEmDolar * cotacaoDolar;
        System.out.println("o vcalor em reais é: R$" + valorReal);
    }


}
