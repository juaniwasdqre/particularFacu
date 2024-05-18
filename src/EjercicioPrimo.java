
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Pedir por consola un número entero e informar si es un número
primo. Un número es primo si solo es divisible por 1 y por sí
mismo. */

public class EjercicioPrimo {

    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
        try{
            System.out.println("ingresar un numero : ");
            num = Integer.valueOf(entrada.readLine());

            if (num%2!=0) {
                System.out.println(num + " SI es un número primo.");
            } else {
                System.out.println(num + " NO es un número primo.");
            }
        }
        catch(Exception exc){
            System.out.println("ERROR!!");
        }
    }

}