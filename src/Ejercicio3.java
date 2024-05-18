/* Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente. */


public class Ejercicio3 {

    final static int MAX = 8;

    public static void main(String[] args) {
        int [] arrenteros = {2,8,3,4,5,6,7,8,9};
        imprimirArreglo(arrenteros);
        esAscendente(arrenteros);

    }

    public static void esAscendente(int [] arr){
        boolean ascendente = (arr[0]<=arr[1]);
        if (ascendente){
            System.out.println("ES ASCENDENTE");
        } else {
            System.out.println("NO ES ASCENDENTE");
        }
    }

    public static void imprimirArreglo(int [] arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }

}