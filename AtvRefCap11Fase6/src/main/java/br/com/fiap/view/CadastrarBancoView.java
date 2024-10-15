package br.com.fiap.view;
import br.com.fiap.dao.BancoDao;
import br.com.fiap.model.Banco;
import java.sql.SQLException;
public class CadastrarBancoView {
    public static void main(String[] args) {
        try {
            BancoDao dao = new BancoDao();
            Banco banco = new Banco(000, "banco");
            dao.cadastrar(banco);
            dao.fecharConexao();
            System.out.println("Banco cadastrado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}