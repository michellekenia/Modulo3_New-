package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorDoAluguel;
    private Funcionario funcionarioResponsavel;
    private List<Morador> listaDeMoradores = new ArrayList<>();

    public Imovel(String endereco, double valorDoAluguel, Funcionario funcionarioResponsavel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getListaDeMoradores() {
        return listaDeMoradores;
    }

    public void setListaDeMoradores(List<Morador> listaDeMoradores) {
        this.listaDeMoradores = listaDeMoradores;
    }

    public void adicionarMorador(Morador novoMorador) {
        listaDeMoradores.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Endereço :" + endereco);
        retorno.append("\n Valor do aluguel :" + valorDoAluguel);
        retorno.append("\n Funcionário responsável :" + funcionarioResponsavel);
        retorno.append("\n Lista de moradores :" + listaDeMoradores);
        return retorno.toString();

    }
}
