import java.io.BufferedReader;
import java.io.InputStreamReader;

/*  Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.

a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.

b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.

c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).

d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter.*/

public class Ejercicioabc {

    public static void main(String[] args) {

        int num = -1;
        char caracter;
        String mensaje;
        boolean ascendente = true;
        int aux = 0 ;
        int mayor = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));

        while(num!=0){

            try{
                System.out.println("ingresa numero positivo o 0 para salir");
                num = Integer.valueOf(entrada.readLine());
                if(num!=0){
                    System.out.println("ingresar un caracter");
                    caracter = entrada.readLine().charAt(0);
                    switch(caracter) {
                        case 'a':
                            System.out.println("puedes ingresar un texto: ");
                            mensaje = entrada.readLine();
                            System.out.println(mensaje);
                            break;
                        case 'b':
                            System.out.println("Ingresa 5 numeros");
                            int temp = 0;
                            boolean asc = true;
                            for(int i = 0; i<5 ; i++ ){
                                num = Integer.valueOf(entrada.readLine());
                                if ((asc)) {
                                    if((num<temp)) {
                                        asc = false;
                                    }
                                }
                                temp = num;
                                //tbc
                            }
                            if (asc) {
                                System.out.println("Ingresaste los numeros de una forma ascendente!");
                            }
                            break;
                        case 'c':
                            System.out.println("Ingresa 2 numeros negativos");
                            int num1 = Integer.valueOf(entrada.readLine());
                            int num2 = Integer.valueOf(entrada.readLine());

                            System.out.println("LA RAIZ CUADRADA DE "+num1+"*"+num2+" = "+Math.sqrt(num1*num2));
                    }

                }
            }
            catch(Exception exc){
                System.out.println("ERROR!!");
            }

        }


    }

}