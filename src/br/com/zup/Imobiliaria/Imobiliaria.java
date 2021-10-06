package br.com.zup.Imobiliaria;

import java.util.List;

public class Imobiliaria {

    private List<Imovel> listaDeImoveis;

    public Imobiliaria(List<Imovel> listaDeImoveismoveis) {
        this.listaDeImoveis = listaDeImoveismoveis;
    }

    public List<Imovel> getListaDeImoveis() {
        return listaDeImoveis;
    }

    public void setListaDeimoveis(List<Imovel> listaDeImoveis) {
        this.listaDeImoveis = listaDeImoveis;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Lista de imóveis :" + listaDeImoveis);
        return retorno.toString();
    }
}
