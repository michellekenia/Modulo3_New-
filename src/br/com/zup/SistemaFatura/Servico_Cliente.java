package br.com.zup.SistemaFatura;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    List<Cliente> listaDeClientes = new ArrayList<>();

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean verificarEmailRepetido(String email) {

        boolean repetido = false;

        for (Cliente verificar : listaDeClientes) {

            if (email.equals(verificar.getEmail())) {
                repetido = true;
            }
        }

        return repetido;
    }

    public void cadastrarCliente(String nome, String cpf, String email) throws Exception {

        if (validarEmail(email)) {
            if (verificarEmailRepetido(email) == false) {
                Cliente cliente = new Cliente(nome, cpf, email);
                listaDeClientes.add(cliente);
            } else {
                throw new Exception("E-mail já cadastrado. Tente novamente");
            }

        } else {
            throw new Exception("E-mail inválido. Tente novamente");
        }
    }


}
