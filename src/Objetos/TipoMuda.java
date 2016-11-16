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
public class TipoMuda {
    private int Id;
    
    private String Descricao;
    
    private double ValorCusto;
    
    private double ValorUnit;
    
    private String TpBandeja;
    
    private boolean PermiteProd;
    

    public TipoMuda(int Id, String Descricao, double ValorCusto, double ValorUnit, String TpBandeja, boolean PermiteProd) {
        this.Id = Id;
        this.Descricao = Descricao;
        this.ValorCusto = ValorCusto;
        this.ValorUnit = ValorUnit;
        this.TpBandeja = TpBandeja;
        this.PermiteProd = PermiteProd;
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

    public double getValorUnit() {
        return ValorUnit;
    }

    public void setValorUnit(double ValorUnit) {
        this.ValorUnit = ValorUnit;
    }

    public String getTpBandeja() {
        return TpBandeja;
    }

    public void setTpBandeja(String TpBandeja) {
        this.TpBandeja = TpBandeja;
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
    
}
