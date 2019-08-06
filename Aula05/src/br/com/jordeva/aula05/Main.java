package br.com.jordeva.aula05;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40};
        Searcher s = new Searcher();
        int pos = s.search(numeros,20);
        System.out.println(pos);
    }
}
