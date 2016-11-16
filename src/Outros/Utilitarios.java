/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Thiago
 */
public class Utilitarios {
    public static String caracteresNumericos = "0123456789";
    public static String caracteresLetrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String caracteresEmail = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@._";
    
    //Cria uma máscara para a declaração de JFormattedTextFields
    public MaskFormatter DefineMascara(String Mascara) throws ParseException {
        MaskFormatter msk = new MaskFormatter();
        msk.setMask(Mascara);
        return msk;
    }
    
    public int CalcPosicJFrameX(int x) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = (screen.height - x) / 2;
        return altura;
    }
    
    public int CalcPosicJFrameY(int y) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int comp = (screen.width - y) / 2;
        return comp;
    }
    
    //Efetua validações gerais em um JTextField
    public boolean ValidaTextField(JTextField txtAnalisado, boolean pPermiteNulo) {
        if (!pPermiteNulo) {
            if (txtAnalisado.getText().isEmpty())
                return false;
        } 
        return true;
    }
    
    //Efetua validações gerais em um JPasswordField
    public boolean ValidaPasswordField(JPasswordField ptxtAnalisado, boolean pPermiteNulo) {
        String pwdDescriptado = new String(ptxtAnalisado.getPassword()).trim();
        if (!pPermiteNulo) {
            if (pwdDescriptado.isEmpty())
                return false;
        } 
        return true;
    }
    
    //Efetua validações gerais em um JFormattedTextField
    public boolean ValidaFTextField(JFormattedTextField ftxtAnalisado, boolean pPermiteNulo) {
        if (!pPermiteNulo) {
            if (ftxtAnalisado.getText().isEmpty())
                return false;
        } 
        return true;
    }
    
    //Apaga os registros de uma JTable
    public void LimparTabela(JTable tabela) {
        while (tabela.getRowCount() > 0) {
            DefaultTableModel cleanModel = (DefaultTableModel) tabela.getModel();
            cleanModel.getDataVector().removeAllElements();
        }
    }
    
    public void LimparJComboBox(JComboBox cbx) {
        while (cbx.getItemCount() != 0) {
            cbx.removeItemAt(0);
        }
    }
    
    /*
    Apaga o texto de todos os JTextField e JFormattedTextFields de um JPanel e
    "zera" outros tipos de componentes.    
    */
    public void ResetPanelComponents (JPanel pnl){
        Component[] compArray = pnl.getComponents();
        for(Component c : compArray){
            if(c instanceof JTextField){
                JTextField txt = (JTextField) c;
                txt.setText("");
            }
            else if (c instanceof JFormattedTextField){
               JFormattedTextField ftxt = (JFormattedTextField) c;
               ftxt.setText("");
            }
            else if (c instanceof JTextArea) {
                JTextArea txa = (JTextArea) c;
                txa.setText("");
            }
        }
    }
}
