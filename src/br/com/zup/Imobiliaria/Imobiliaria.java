package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel> listaDeImoveis = new ArrayList<>();

    public Imobiliaria(List<Imovel> listaDeImoveismoveis) {
        this.listaDeImoveis = listaDeImoveismoveis;
    }

    public Imobiliaria() {

    }

    public List<Imovel> getListaDeImoveis() {
        return listaDeImoveis;
    }

    public void adicionarImovel(Imovel novoImovel) {
        listaDeImoveis. add(novoImovel);
    }

    public void setListaDeimoveis(List<Imovel> listaDeImoveis) {
        this.listaDeImoveis = listaDeImoveis;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nLista de imóveis :" + listaDeImoveis);
        return retorno.toString();
    }
}
