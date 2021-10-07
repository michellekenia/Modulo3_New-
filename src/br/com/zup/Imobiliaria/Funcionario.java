package br.com.zup.Imobiliaria;

public class Funcionario extends Pessoa {

    private String codigoFuncionario;

    public Funcionario(String nome, String cpf, String codigoFuncionario) {
        super(nome, cpf);
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\n Código do Funcionário: " + codigoFuncionario);
        return retorno.toString();
    }
}
