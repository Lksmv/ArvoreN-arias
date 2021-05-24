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
public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        raiz = null;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }

    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String texto = "<";
        texto = texto + no.getInfo();

        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {

            texto = texto + obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        texto = texto + ">";
        return texto;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        }
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        } else {
            NoArvore<T> p = no.getPrimeiro();
            while (p != null) {
                if (pertence(p, info)) {
                    return true;
                } else {
                    p = p.getProximo();
                }
            }
            return false;
        }
    }

    public int contarNos() {
        if (raiz == null) {
            return 0;
        } else {
            return contarNos(getRaiz());
        }
    }

    private int contarNos(NoArvore<T> no) {
        int qnt = 1;
        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            qnt += contarNos(p);
            p = p.getProximo();
        }
        return qnt;
    }

}
