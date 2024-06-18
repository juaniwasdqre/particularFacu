import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Hacer un programa que dado un arreglo de enteros y un número n,
 genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número m todas las
ocurrencias del número n en el arreglo original. */

public class Ejercicio7arr {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] arrenteros = {2,0,0,2,2,3,4,5,6,10};
        imprimirArreglo(arrenteros);
        numeroNingresado(arrenteros);
    }

    public static void imprimirArreglo(int [] arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print("[" + arr[pos] + "]");
        }
    }

    public static void numeroNingresado(int [] arr){
        int n = 2;
        int m = 5;
        int pos;
        int [] primoPos = new int[MAX];
        int contador = 0;
        for (int i = 0; i<MAX; i++) {
            for(int j = 0 ; j<MAX; j++){
                if(n == arr[j]){
                    contador++;
                    pos = j;
                    i++;
                }
            }
        }
        System.out.println("el resultado de la multiplicacion es : " + (contador * m));
    }
}