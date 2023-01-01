package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * The type Connection dao.
 */
public class ConnectionDAO {

    /**
     * @return Connection
     */
    private Connection conectar() {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "colocar a senha aqui";
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * Listar contatos array list.
     *
     * @return the array list
     */
    public ArrayList<JavaBeans> listarContatos() {

        ArrayList<JavaBeans> contatos = new ArrayList<>();
        String read = "select * from contatos order by idcon";

        try {
            Connection con = conectar();
            assert con != null;
            PreparedStatement pst = con.prepareStatement(read);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String idcon = rs.getString(1);
                String nome = rs.getString(2);
                String fone = rs.getString(3);
                String email = rs.getString(4);
                contatos.add(new JavaBeans(idcon, nome, fone, email));
            }
            con.close();
            return contatos;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
