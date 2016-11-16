/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

/**
 *
 * @author Thiago
 */
public enum ModoOperacaoForm{
    PESQUISA(1),INCLUSAO(2),ALTERACAO(3),EXCLUSAO(4),PADRAO(5);

    public int EstadoAtual;

    private ModoOperacaoForm(int EstadoAtual) {
        this.EstadoAtual = EstadoAtual;
    }    
}