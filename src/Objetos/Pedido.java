/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import java.util.Date;
/**
 *
 * @author User08
 */
public class Pedido {
    private int IdPedido;
    
    private int IdCliente;
    
    private Date DtCriacao;
    
    private Date DtExecucao;
    
    private String Status;
    
    private String IdFunc;
    
    private double ValorTotal;
    
    private double ValorDesconto;
    
    private String MotivoDesconto;
    
    private String Observacoes;

    public Pedido(int IdPedido, int IdCliente, Date DtCriacao, Date DtExecucao, String Status, String IdFunc, double ValorTotal, double ValorDesconto, String MotivoDesconto, String Observacoes) {
        this.IdPedido = IdPedido;
        this.IdCliente = IdCliente;
        this.DtCriacao = DtCriacao;
        this.DtExecucao = DtExecucao;
        this.Status = Status;
        this.IdFunc = IdFunc;
        this.ValorTotal = ValorTotal;
        this.ValorDesconto = ValorDesconto;
        this.MotivoDesconto = MotivoDesconto;
        this.Observacoes = Observacoes;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Date getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(Date DtCriacao) {
        this.DtCriacao = DtCriacao;
    }

    public Date getDtExecucao() {
        return DtExecucao;
    }

    public void setDtExecucao(Date DtExecucao) {
        this.DtExecucao = DtExecucao;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIdFunc() {
        return IdFunc;
    }

    public void setIdFunc(String IdFunc) {
        this.IdFunc = IdFunc;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public double getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(double ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }

    public String getMotivoDesconto() {
        return MotivoDesconto;
    }

    public void setMotivoDesconto(String MotivoDesconto) {
        this.MotivoDesconto = MotivoDesconto;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    } 
    
}
