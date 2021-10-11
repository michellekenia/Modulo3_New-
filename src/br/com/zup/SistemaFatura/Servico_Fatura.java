package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Servico_Fatura {

    List<Fatura> listaDeFaturas = new ArrayList<>();

    public void cadastrarFatura(double valor, String dataDeVencimento, Cliente cliente) {
        Fatura fatura = new Fatura(valor, dataDeVencimento, cliente);
        listaDeFaturas.add(fatura);
    }

    public List<Fatura> faturasCliente(String email) {
        List<Fatura> faturasCliente = new ArrayList<>();

        for (Fatura fatura : listaDeFaturas) {
            Cliente clienteDaFatura = fatura.getCliente();

            if (email.equals(clienteDaFatura.getEmail())) {
                faturasCliente.add(fatura);
            }
        }

        return faturasCliente;
    }

}
