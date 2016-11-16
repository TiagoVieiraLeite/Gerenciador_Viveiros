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
public class MudaProduto {
    private int IdMuda;
    
    private int IdProduto;
    
    private double qtdeUsado;

    public MudaProduto(int IdMuda, int IdProduto, double qtdeUsado) {
        this.IdMuda = IdMuda;
        this.IdProduto = IdProduto;
        this.qtdeUsado = qtdeUsado;
    }

    public int getIdMuda() {
        return IdMuda;
    }

    public void setIdMuda(int IdMuda) {
        this.IdMuda = IdMuda;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public double getQtdeUsado() {
        return qtdeUsado;
    }

    public void setQtdeUsado(double qtdeUsado) {
        this.qtdeUsado = qtdeUsado;
    }
    
}
