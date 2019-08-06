package br.com.jordeva.aula05;

public class Searcher {
    public int search(int[] numeros, int value) {
        return binarySearch(numeros, value, 0, numeros.length -1);
    }

    private int binarySearch(int[] numeros, int value, int start, int end){
        if(end < start) {
            return -1;
        }

        int meio = Math.floorDiv(start + end, 2);

        if(value == numeros[meio]){
            return meio;
        }

        if(value < numeros[meio]){
            return binarySearch(numeros, value, start, meio-1);
        }else{
            return binarySearch(numeros, value, meio+1, end);
        }
    }
}
