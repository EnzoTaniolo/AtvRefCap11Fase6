package br.com.fiap.view;
import br.com.fiap.dao.BancoDao;
import br.com.fiap.dao.ContaBancariaDao;
import br.com.fiap.model.Banco;
import br.com.fiap.model.ContaBancaria;

import java.sql.SQLException;
public class CadastrarContaBancariaView {
    public static void main(String[] args) {
        try {
            ContaBancariaDao dao = new ContaBancariaDao();
            ContaBancaria conta = new ContaBancaria(23456789, 53465474, "corrente", 1000000.01, 27);
            dao.cadastrarConta(conta);
            dao.fecharConexao();
            System.out.println("Conta cadastrada!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}