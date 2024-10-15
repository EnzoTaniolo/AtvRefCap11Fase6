package br.com.fiap.view;
import br.com.fiap.dao.BancoDao;
import br.com.fiap.model.Banco;
import java.sql.SQLException;
import java.util.List;
public class ListagemBancoView {
    public static void main(String[] args) {
        try {
            BancoDao dao = new BancoDao();
            List<Banco> bancos = dao.listar();
            for (Banco banco : bancos) {
                System.out.println(banco.getCdBanco() + " " + banco.getNmBanco());
            }
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}