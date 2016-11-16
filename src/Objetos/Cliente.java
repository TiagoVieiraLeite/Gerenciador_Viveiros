package Objetos;

import ConexaoBanco.ManipuladorSQL;
import java.sql.SQLException;

public class Cliente {

    private int Id;

    private String Nome;

    private String NrDocumento;

    private String TpDocumento;

    private String Endereco;

    private int Cidade;
    
    private String Bairro;
    
    private String Telefone1;
    
    private String Telefone2;
    
    private String Email;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNrDocumento() {
        return NrDocumento;
    }

    public void setNrDocumento(String NrDocumento) {
        this.NrDocumento = NrDocumento;
    }

    public String getTpDocumento() {
        return TpDocumento;
    }

    public void setTpDocumento(String TpDocumento) {
        this.TpDocumento = TpDocumento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getCidade() {
        return Cidade;
    }

    public void setCidade(int Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public Cliente(int Id, String Nome, String NrDocumento, String TpDocumento, String Endereco, 
            int Cidade, String Bairro, String Telefone1, String Telefone2, String Email) {
        this.Id = Id;
        this.Nome = Nome;
        this.NrDocumento = NrDocumento;
        this.TpDocumento = TpDocumento;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Email = Email;
    }
    
    public Cliente(String Nome, String NrDocumento, String TpDocumento, String Endereco, 
            int Cidade, String Bairro, String Telefone1, String Telefone2, String Email) {
        this.Nome = Nome;
        this.NrDocumento = NrDocumento;
        this.TpDocumento = TpDocumento;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Email = Email;
    }
    
    public Cliente(int Id) {
        this.Id = Id;
    }
    
    public void InsertCliente() throws SQLException, Exception{
        try {
          ManipuladorSQL sql = new ManipuladorSQL();
          String query = "INSERT INTO CLIENTE " + 
                  "(NOME, NRDOCUMENTO, TPDOCUMENTO, ENDERECO, IDCIDADE, " +
                  "BAIRRO, TELEFONE1, TELEFONE2, EMAIL) " +
                  "VALUES (?,?,?,?,?,?,?,?,?);";
          Object[] valores = new Object[9];
          valores[0] = this.Nome;
          valores[1] = this.NrDocumento;
          valores[2] = this.TpDocumento;
          valores[3] = this.Endereco;
          valores[4] = this.Cidade;
          valores[5] = this.Bairro;
          valores[6] = this.Telefone1;
          valores[7] = this.Telefone2;
          valores[8] = this.Email;
                  
          sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void UpdateCliente() throws SQLException, Exception {
        try {
          ManipuladorSQL sql = new ManipuladorSQL();
          String query = "UPDATE CLIENTE " + 
                  "SET NOME = ?, NRDOCUMENTO = ?, TPDOCUMENTO = ?, ENDERECO = ?, " +
                  "IDCIDADE = ?, BAIRRO = ?, TELEFONE1 = ?, TELEFONE2 = ?, EMAIL = ? " +
                  "WHERE ID = ?;";
          
          Object[] valores = new Object[10];
          valores[0] = this.Nome;
          valores[1] = this.NrDocumento;
          valores[2] = this.TpDocumento;
          valores[3] = this.Endereco;
          valores[4] = this.Cidade;
          valores[5] = this.Bairro;
          valores[6] = this.Telefone1;
          valores[7] = this.Telefone2;
          valores[8] = this.Email;
          valores[9] = this.Id;
          sql.InsertUpdateData(query, valores);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public void DeleteCliente () throws SQLException, Exception{
        try {
            ManipuladorSQL sql = new ManipuladorSQL();
            String query = "DELETE FROM CLIENTE WHERE ID = ?;";
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
            String query = "SELECT ID FROM CLIENTE WHERE NRDOCUMENTO = '" +
                    this.NrDocumento + "';";
            this.Id = (int) sql.GetSingleData(query);
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
