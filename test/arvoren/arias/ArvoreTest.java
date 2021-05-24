/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoren.arias;

import model.NoArvore;
import model.Arvore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ArvoreTest {

    public ArvoreTest() {
    }

    @Test
    public void test1Validar() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);

        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilha(no7);
        no2.inserirFilha(no6);
        no2.inserirFilha(no5);

        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilha(no8);

        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilha(no10);
        no4.inserirFilha(no9);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilha(no4);
        no1.inserirFilha(no3);
        no1.inserirFilha(no2);

        Arvore arvore = new Arvore();
        arvore.setRaiz(no1);
        System.out.println(arvore.toString());
        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());

    }

    @Test
    public void test2Buscar() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);

        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilha(no7);
        no2.inserirFilha(no6);
        no2.inserirFilha(no5);

        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilha(no8);

        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilha(no10);
        no4.inserirFilha(no9);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilha(no4);
        no1.inserirFilha(no3);
        no1.inserirFilha(no2);

        Arvore arvore = new Arvore();
        arvore.setRaiz(no1);
        assertEquals(true, arvore.pertence(7));
    }

    @Test
    public void test3pertence() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);

        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilha(no7);
        no2.inserirFilha(no6);
        no2.inserirFilha(no5);

        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilha(no8);

        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilha(no10);
        no4.inserirFilha(no9);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilha(no4);
        no1.inserirFilha(no3);
        no1.inserirFilha(no2);

        Arvore arvore = new Arvore();
        arvore.setRaiz(no1);
        assertEquals(false, arvore.pertence(55));
    }

    @Test
    public void test4Contar() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);

        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilha(no7);
        no2.inserirFilha(no6);
        no2.inserirFilha(no5);

        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilha(no8);

        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilha(no10);
        no4.inserirFilha(no9);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilha(no4);
        no1.inserirFilha(no3);
        no1.inserirFilha(no2);

        Arvore arvore = new Arvore();
        arvore.setRaiz(no1);
        assertEquals(10, arvore.contarNos());
    }
}
