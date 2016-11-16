/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago
 */
public class ManipuladorSQL {
    public DefaultTableModel GetTableData (String[] colunas, String query, JTable tbl) throws SQLException, Exception {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();          
        PreparedStatement stm = Conexao.con.prepareStatement(query);
        ResultSet rs = stm.executeQuery(); 

        dtm.setColumnIdentifiers(colunas);
        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
        int colNo = rsmd.getColumnCount();

        while(rs.next()){
            Object[] objects = new Object[colNo];
            for (int i = 0; i < colNo; i++) {
                objects[i] = rs.getObject(i+1);
            }
            dtm.addRow(objects);
        }    
        return dtm;   
    }
    
    public DefaultComboBoxModel GetComboBoxData (String query, JComboBox cbx) throws SQLException, Exception {
        DefaultComboBoxModel dtm = (DefaultComboBoxModel) cbx.getModel();
        PreparedStatement stm = Conexao.con.prepareStatement(query);
        ResultSet rs = stm.executeQuery(); 
        
        while(rs.next()) {
            dtm.addElement(rs.getObject(1));
        }
        return dtm;
    }
    
    public int InsertUpdateData (String query, Object[] campos ) throws SQLException, Exception {
        int wasInserted;
        try (PreparedStatement stm = Conexao.con.prepareStatement(query)) {
            for (int i = 0; i < campos.length; i++) {
                stm.setObject(i+1, campos[i]);
            }   wasInserted = stm.executeUpdate();
        }
        return wasInserted;
    }
    
    public int DeleteData (String query, Object id) throws SQLException, Exception {
        int wasDeleted;
        try (PreparedStatement stm = Conexao.con.prepareStatement(query)) {
            stm.setObject(1, id);
            wasDeleted = stm.executeUpdate();
        }
        return wasDeleted;
    }
    
    /**
     * Use this function to select a single value from a table or view.
     * @param query
     * @return The first value, from the first column selected
     * @throws SQLException
     * @throws Exception
     */
    public Object GetSingleData (String query) throws SQLException, Exception {        
        PreparedStatement stm = Conexao.con.prepareStatement(query);
        ResultSet rs = stm.executeQuery(); 
        
        rs.first();
        return rs.getObject(1);   
    }
    
    public ResultSet GetListData (String query) throws SQLException, Exception {
        PreparedStatement stm = Conexao.con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();
        return rs;
    }
}
