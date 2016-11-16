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
public class Producao {
    private int IdProducao;
    
    private int IdEvento;
    
    private int IdPedido;
    
    private Date DtPrazo;
    
    private Date DtExecucao;
    
    private int QtdeSolicitada;
    
    private int QtdeExecutada;

    public Producao(int IdProducao, int IdEvento, int IdPedido, Date DtPrazo, Date DtExecucao, int QtdeSolicitada, int QtdeExecutada) {
        this.IdProducao = IdProducao;
        this.IdEvento = IdEvento;
        this.IdPedido = IdPedido;
        this.DtPrazo = DtPrazo;
        this.DtExecucao = DtExecucao;
        this.QtdeSolicitada = QtdeSolicitada;
        this.QtdeExecutada = QtdeExecutada;
    }

    public int getIdProducao() {
        return IdProducao;
    }

    public void setIdProducao(int IdProducao) {
        this.IdProducao = IdProducao;
    }

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int IdEvento) {
        this.IdEvento = IdEvento;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public Date getDtPrazo() {
        return DtPrazo;
    }

    public void setDtPrazo(Date DtPrazo) {
        this.DtPrazo = DtPrazo;
    }

    public Date getDtExecucao() {
        return DtExecucao;
    }

    public void setDtExecucao(Date DtExecucao) {
        this.DtExecucao = DtExecucao;
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
}
