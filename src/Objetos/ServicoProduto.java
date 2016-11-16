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
public class ServicoProduto {
    private int IdServico;
    
    private int IdProduto;
    
    private double QtdeUsado;

    public ServicoProduto(int IdServico, int IdProduto, double QtdeUsado) {
        this.IdServico = IdServico;
        this.IdProduto = IdProduto;
        this.QtdeUsado = QtdeUsado;
    }

    public int getIdServico() {
        return IdServico;
    }

    public void setIdServico(int IdServico) {
        this.IdServico = IdServico;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public double getQtdeUsado() {
        return QtdeUsado;
    }

    public void setQtdeUsado(double QtdeUsado) {
        this.QtdeUsado = QtdeUsado;
    }
    
    
}
