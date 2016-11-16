package Objetos;

import ConexaoBanco.ManipuladorSQL;
import java.sql.SQLException;

public class Funcionario {

    private int Id;

    private String Codigo;

    private String Nome;

    private String Senha;

    private String NvlAcesso;

    private String Telefone;
    
    private boolean AcessaSistema;
    
    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNvlAcesso() {
        return NvlAcesso;
    }

    public void setNvlAcesso(String NvlAcesso) {
        this.NvlAcesso = NvlAcesso;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public boolean isAcessaSistema() {
        return AcessaSistema;
    }

    public void setAcessaSistema(boolean AcessaSistema) {
        this.AcessaSistema = AcessaSistema;
    }

    public Funcionario(String Codigo, String Nome, String Telefone, 
            String NvlAcesso, String Senha, boolean AcessaSistema) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Senha = Senha;
        this.NvlAcesso = NvlAcesso;
        this.Telefone = Telefone;
        this.AcessaSistema = AcessaSistema;
    }
    
    public Funcionario(int Id, String Codigo, String Nome, String Telefone, 
            String NvlAcesso, String Senha, boolean AcessaSistema) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Senha = Senha;
        this.NvlAcesso = NvlAcesso;
        this.Telefone = Telefone;
        this.AcessaSistema = AcessaSistema;
    }
    
    public Funcionario(int Id){
        this.Id = Id;
    }
    
    public void InsertFuncionario() throws SQLException, Exception {
        try {
          ManipuladorSQL sql = new ManipuladorSQL();
          String query = "INSERT INTO FUNCIONARIO " + 
                  "(LOGIN, NOME, SENHA, NVLACESSO, TELEFONE, ACESSASISTEMA) " +
                  "VALUES (?,?,?,?,?,?);";
          Object[] valores = new Object[6];
          valores[0] = this.Codigo;
          valores[1] = this.Nome;
          valores[2] = this.Senha;
          valores[3] = this.NvlAcesso;
          valores[4] = this.Telefone;
          valores[5] = this.AcessaSistema;
          sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void UpdateFuncionario() throws SQLException, Exception {
        try {
          ManipuladorSQL sql = new ManipuladorSQL();
          String query = "UPDATE FUNCIONARIO " + 
                  "SET LOGIN = ?, NOME = ?, SENHA = ?, NVLACESSO = ?, TELEFONE = ?,  ACESSASISTEMA = ? " +
                  "WHERE ID = ?;";
          Object[] valores = new Object[7];
          valores[0] = this.Codigo;
          valores[1] = this.Nome;
          valores[2] = this.Senha;
          valores[3] = this.NvlAcesso;
          valores[4] = this.Telefone;
          valores[5] = this.AcessaSistema;
          valores[6] = this.Id;
          sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void DeleteFuncionario () throws SQLException, Exception{
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "DELETE FROM FUNCIONARIO WHERE ID = ?;";
            sql.DeleteData(query, Id);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void AtualizaId () throws SQLException, Exception{
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "SELECT ID FROM FUNCIONARIO WHERE LOGIN = '" +
                    this.Codigo + "';";
            this.Id = (int) sql.GetSingleData(query);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public String RecuperaSenha () throws SQLException, Exception{
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "SELECT SENHA FROM FUNCIONARIO WHERE ID = '" +
                    this.Id + "';";
            this.Senha = (String) sql.GetSingleData(query);
            return this.Senha;
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        } 
    }   
}
