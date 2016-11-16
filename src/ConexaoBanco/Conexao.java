/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import static ConexaoBanco.Conexao.con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Conexao {
    public static Connection con = null;
    
    public void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root","root","@fatec8s121359");
            PreparedStatement stm = con.prepareStatement("USE DEV_TG;");
            stm.executeQuery();
        } 
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado, entre em contato com o fornecedor do sistema.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            throw new RuntimeException(e);
        }
    }
}
