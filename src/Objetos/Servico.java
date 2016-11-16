/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import ConexaoBanco.ManipuladorSQL;
import java.sql.SQLException;
/**
 *
 * @author User08
 */
public class Servico {
    private int Id;
    
    private String Descricao;
    
    private double ValorCusto;
    
    private double ValorServ;
    
    private boolean PermiteProd;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValorServ() {
        return ValorServ;
    }

    public void setValorServ(double ValorServ) {
        this.ValorServ = ValorServ;
    }

    public boolean isPermiteProd() {
        return PermiteProd;
    }

    public void setPermiteProd(boolean PermiteProd) {
        this.PermiteProd = PermiteProd;
    }
    
    public double getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(double ValorCusto) {
        this.ValorCusto = ValorCusto;
    }
    
    public Servico(int Id, String Descricao, double ValorCusto, double ValorServ, 
            boolean PermiteProd) {
        this.Id = Id;
        this.Descricao = Descricao;
        this.ValorServ = ValorServ;
        this.PermiteProd = PermiteProd;
        this.ValorCusto = ValorCusto;
    }
    
    public Servico(String Descricao, double ValorCusto, double ValorServ, 
            boolean PermiteProd) {
        this.Descricao = Descricao;
        this.ValorServ = ValorServ;
        this.PermiteProd = PermiteProd;
        this.ValorCusto = ValorCusto;
    }
    
    public Servico(int Id){
        this.Id = Id;
    }
    
    public void InsertServico() throws SQLException, Exception{
        try {    
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "INSERT INTO SERVICO " + 
                    "(DESCRICAO, VALORSERVICO, PERMITEPROD, VALORCUSTO) " +
                    "VALUES (?,?,?,?);";
            Object[] valores = new Object[4];
            valores[0] = this.Descricao;
            valores[1] = this.ValorServ;
            valores[2] = this.PermiteProd;
            valores[3] = this.ValorCusto;
                  
            sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void UpdateServico() throws SQLException, Exception {
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "UPDATE SERVICO " + 
                    "SET DESCRICAO = ?, VALORSERVICO = ?, PERMITEPROD = ?, VALORCUSTO = ? " +
                    "WHERE ID = ?;";

            Object[] valores = new Object[5];
            valores[0] = this.Descricao;
            valores[1] = this.ValorServ;
            valores[2] = this.PermiteProd;
            valores[3] = this.ValorCusto;
            valores[4] = this.Id;
            
            sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void DeleteServico () throws SQLException, Exception{
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "DELETE FROM SERVICO WHERE ID = ?;";
            sql.DeleteData(query, Id);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
