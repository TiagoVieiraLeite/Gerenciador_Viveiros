/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author User08
 */
public class Produto {
    private int Id;
    
    private String Descricao;
    
    private String Unidade;
    
    private double ValorRevenda;
    
    private double ValorUnit;
    
    private boolean ControlaQtde;
    
    private double QtdeDisponivel;
    
    private String Tipo;

    public Produto(int Id, String Descricao, String Unidade, double ValorRevenda, double ValorUnit, boolean ControlaQtde, double QtdeDisponivel, String Tipo) {
        this.Id = Id;
        this.Descricao = Descricao;
        this.Unidade = Unidade;
        this.ValorRevenda = ValorRevenda;
        this.ValorUnit = ValorUnit;
        this.ControlaQtde = ControlaQtde;
        this.QtdeDisponivel = QtdeDisponivel;
        this.Tipo = Tipo;
    }

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

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String Unidade) {
        this.Unidade = Unidade;
    }

    public double getValorUnit() {
        return ValorUnit;
    }

    public void setValorUnit(double ValorUnit) {
        this.ValorUnit = ValorUnit;
    }

    public boolean isControlaQtde() {
        return ControlaQtde;
    }

    public void setControlaQtde(boolean ControlaQtde) {
        this.ControlaQtde = ControlaQtde;
    }

    public double getQtdeDisponivel() {
        return QtdeDisponivel;
    }

    public void setQtdeDisponivel(double QtdeDisponivel) {
        this.QtdeDisponivel = QtdeDisponivel;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public double getValorRevenda() {
        return ValorRevenda;
    }

    public void setValorRevenda(double ValorRevenda) {
        this.ValorRevenda = ValorRevenda;
    }
    
}
