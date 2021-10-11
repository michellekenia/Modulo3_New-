package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Servico_Fatura {

    List<Fatura> listaDeFaturas = new ArrayList<>();

    public void cadastrarFatura(double valor, String dataDeVencimento, Cliente cliente) {
        Fatura fatura = new Fatura(valor, dataDeVencimento, cliente);
        listaDeFaturas.add(fatura);
    }

}
