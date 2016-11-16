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
public class EventoPedido {
    private int IdPedido;
    
    private int IdEvento;
    
    private Date DtCriacao;
    
    private Date DtExecucao;
    
    private int IdMuda;
    
    private int IdServico;
    
    private int QtdeSolicitada;
    
    private int QtdeExecutada;
    
    private String TpEvento;
    
    private double ValorEvento;
    
    private String Observacoes;

    public EventoPedido(int IdPedido, int IdEvento, Date DtCriacao, Date DtExecucao, int IdMuda, int IdServico, int QtdeSolicitada, int QtdeExecutada, String TpEvento, double ValorEvento, String Observacoes) {
        this.IdPedido = IdPedido;
        this.IdEvento = IdEvento;
        this.DtCriacao = DtCriacao;
        this.DtExecucao = DtExecucao;
        this.IdMuda = IdMuda;
        this.IdServico = IdServico;
        this.QtdeSolicitada = QtdeSolicitada;
        this.QtdeExecutada = QtdeExecutada;
        this.TpEvento = TpEvento;
        this.ValorEvento = ValorEvento;
        this.Observacoes = Observacoes;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int IdEvento) {
        this.IdEvento = IdEvento;
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

    public int getIdMuda() {
        return IdMuda;
    }

    public void setIdMuda(int IdMuda) {
        this.IdMuda = IdMuda;
    }

    public int getIdServico() {
        return IdServico;
    }

    public void setIdServico(int IdServico) {
        this.IdServico = IdServico;
    }

    public int getQtdeSolicitada() {
        return QtdeSolicitada;
    }

    public void setQtdeSolicitada(int QtdeSolicitada) {
        this.QtdeSolicitada = QtdeSolicitada;
    }

    public int getQtdeExecutada() {
        return QtdeExecutada;
    }

    public void setQtdeExecutada(int QtdeExecutada) {
        this.QtdeExecutada = QtdeExecutada;
    }

    public String getTpEvento() {
        return TpEvento;
    }

    public void setTpEvento(String TpEvento) {
        this.TpEvento = TpEvento;
    }

    public double getValorEvento() {
        return ValorEvento;
    }

    public void setValorEvento(double ValorEvento) {
        this.ValorEvento = ValorEvento;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    
    
}
