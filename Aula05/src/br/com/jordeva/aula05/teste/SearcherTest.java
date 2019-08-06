package br.com.jordeva.aula05.teste;

import br.com.jordeva.aula05.Searcher;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SearcherTest {

    private Searcher searcher;

    @org.junit.Before
    public void setUp() throws Exception {
        searcher = new Searcher();
    }

    @Test
    public void retornaMenos1SeArrayEstaVazio(){
        int [] entrada = {};
        assertEquals(-1,searcher.search(entrada,10));
    }

    @Test
    public void retornaMenos1SeElementoNaoEncontrado(){
        int [] entrada = {11,12,13};
        assertEquals(-1,searcher.search(entrada,50));
    }

    @Test
    public void retornaPosicaoSeElementoForEncontrado(){
        int [] entrada = {11,12,13, 14};
        assertEquals(0,searcher.search(entrada,11));
        assertEquals(1,searcher.search(entrada,12));
        assertEquals(2,searcher.search(entrada,13));
        assertEquals(3,searcher.search(entrada,14));
    }

    @Test
    public void retornaPosicaoSeElementoAleatorioForEncontrado(){
        Random r = new Random();
        int size = 1 + Math.abs(r.nextInt()) % 10;
        int [] entrada = new int[size];

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = r.nextInt() % 100;
        }

        Arrays.sort(entrada);

        int pos = Math.abs(r.nextInt()) % entrada.length;

        assertEquals(pos,searcher.search(entrada,entrada[pos]));
    }
}