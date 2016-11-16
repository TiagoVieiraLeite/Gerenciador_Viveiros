/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import Forms.FrmLogin;
//import Forms.Modelos.FrmCadastro_Modelo;
import Objetos.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Tiago Vieira Leite
 */
public class GerenciadorViveiros {

    public static Funcionario usuarioAtual;
            
    public static void main(String[] args) {       
        FrmLogin frmLogin = new FrmLogin();
        //FrmCadastro_Modelo frmLogin = new FrmCadastro_Modelo();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(frmLogin);
            frmLogin.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Erro ao iniciar a aplicação!" + "\n" + "Mensagem: "
                    + e.getMessage(), "Falha",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
