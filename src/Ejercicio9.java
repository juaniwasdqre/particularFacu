/* Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. */

public class Ejercicio9 {

    final static int MAX = 10;
    public static void main(String[] args) {
        char [] arrenteros = {'a','b','c','x','v','k','n','u','o','x'};

        mostrarArreglo(arrenteros);
        hayRepetido(arrenteros);

    }


    public static boolean letraRepetidaArreglo(char [] arr){
        boolean repetido = false;
        //CUANDO MAS DE 1 FOR
        //i, j (CONTADORES NOMENCLATURA)
        for (int i = 0; i<MAX; i++){
            for (int j = i+1; j<MAX; j++){
                if (arr[i] == arr[j]) {
                    repetido = true;
                    break;
                }
            }
        }
        return repetido;
    }

    public static void mostrarArreglo(char [] arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print("[" + arr[pos] + "]");
        }
    }

    public static void hayRepetido (char[] arr) {
        boolean repetido = letraRepetidaArreglo(arr);
        String rta;
        if (repetido){
            rta = "SI";
        } else {
            rta = "NO";
        }
        System.out.println("Existe al menos una letra repetida? : "+rta);
    }
}