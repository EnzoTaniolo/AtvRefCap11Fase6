package br.com.fiap.dao;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Banco;
import br.com.fiap.model.ContaBancaria;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaBancariaDao {
    private Connection conexao;
    public ContaBancariaDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrarConta(ContaBancaria conta) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_conta_bancaria (cd_conta_bancaria, cd_usuario, ds_tipo, vl_saldo, cd_banco) VALUES (?, ?, ?, ?, ?)");
        stm.setInt(1, conta.getCdContaBancaria());
        stm.setInt(2, conta.getCdUsuario());
        stm.setString(3, conta.getDsTipo());
        stm.setDouble(4, conta.getSaldo());
        stm.setInt(5, conta.getCdBanco());
        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private ContaBancaria parseConta(ResultSet result) throws SQLException {
        int cdContaBancaria = result.getInt("cd_Conta_bancaria");
        int cdUsuario = result.getInt("cd_Usuario");
        String dsTipo = result.getString("ds_Tipo");
        double saldo = result.getDouble("vl_Saldo");
        int cdBanco = result.getInt("cd_Banco");
        return new ContaBancaria(cdContaBancaria, cdUsuario, dsTipo, saldo, cdBanco);
    }

    public List<ContaBancaria> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_conta_bancaria");
        ResultSet result = stm.executeQuery();
        List<ContaBancaria> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseConta(result));
        }
        return lista;
    }

}
