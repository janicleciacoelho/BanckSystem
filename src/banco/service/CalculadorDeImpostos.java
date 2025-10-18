package banco.service;

import banco.model.Tributavel;

public class CalculadorDeImpostos {

    public void calcular(Tributavel t) {
        double valor = t.getValorImposto();
        System.out.println("Imposto devido: R$" + valor);
    }
}
