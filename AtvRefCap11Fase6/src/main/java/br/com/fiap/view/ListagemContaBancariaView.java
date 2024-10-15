package br.com.fiap.view;
import br.com.fiap.dao.BancoDao;
import br.com.fiap.dao.ContaBancariaDao;
import br.com.fiap.model.Banco;
import br.com.fiap.model.ContaBancaria;

import java.sql.SQLException;
import java.util.List;
public class ListagemContaBancariaView {
    public static void main(String[] args) {
        try {
            ContaBancariaDao dao = new ContaBancariaDao();
            List<ContaBancaria> contas = dao.listar();
            for (ContaBancaria conta : contas) {
                System.out.println("Número da conta: " + conta.getCdContaBancaria() + " Código do Usuário: " + conta.getCdUsuario() + " Tipo da Conta: " + conta.getDsTipo() + " Saldo: " + conta.getSaldo() + " Código Banco: " + conta.getCdBanco());
            }
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}