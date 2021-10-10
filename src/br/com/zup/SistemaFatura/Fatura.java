package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private double valor;
    private String dataDeVencimento;
    private Cliente cliente;

    public Fatura(double valor, String dataDeVencimento,Cliente cliente) {
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nValor da fatura: " + valor);
        retorno.append("\nData de vencimento: " + dataDeVencimento);
        retorno.append("\nCliente  " +cliente);
        return retorno.toString();
    }
}
