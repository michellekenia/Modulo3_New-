package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    List<Cliente> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente( String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        listaDeClientes.add(cliente);
    }

}
