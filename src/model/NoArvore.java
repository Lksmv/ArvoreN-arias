/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class NoArvore<T> {

    private NoArvore primeiro;
    private NoArvore proximo;
    private T info;

    public NoArvore(T info) {
        this.info = info;
        primeiro = null;
        proximo = null;
    }

    public void inserirFilha(NoArvore<T> sa) {
        sa.setProximo(this.primeiro);
        setPrimeiro(sa);
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setPrimeiro(NoArvore primeiro) {
        this.primeiro = primeiro;
    }

    public void setProximo(NoArvore proximo) {
        this.proximo = proximo;
    }

    public T getInfo() {
        return info;
    }

}
