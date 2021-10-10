package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    List<Cliente> listaDeClientes = new ArrayList<>();

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public void cadastrarCliente(String nome, String cpf, String email) throws Exception {

        if (validarEmail(email)) {
            Cliente cliente = new Cliente(nome, cpf, email);
            listaDeClientes.add(cliente);
        } else {
            throw new Exception("E-mail inválido. Tente novamente");
        }
    }


}
