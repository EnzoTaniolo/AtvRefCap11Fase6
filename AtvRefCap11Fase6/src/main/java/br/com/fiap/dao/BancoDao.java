package br.com.fiap.dao;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Banco;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDao {
    private Connection conexao;
    public BancoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Banco banco) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_banco (cd_banco, nm_banco) VALUES (?, ?)");
        stm.setInt(1, banco.getCdBanco());
        stm.setString(2, banco.getNmBanco());
        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Banco parseBanco(ResultSet result) throws SQLException {
        int cdBanco = result.getInt("cd_Banco");
        String nmBanco = result.getString("nm_Banco");
        return new Banco(cdBanco, nmBanco);
    }

    public List<Banco> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_banco");
        ResultSet result = stm.executeQuery();
        List<Banco> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseBanco(result));
        }
        return lista;
    }

}
