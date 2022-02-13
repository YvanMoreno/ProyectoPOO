package trabajoF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("*****SISTEMA COCHERA*****");
        System.out.println("---------BIENVENIDOS---------");
        int proceso;
        Scanner datos = new Scanner(System.in);
        System.out.println("--------INICIANDO REGISTRO-----");




        int dato=1;
        while (dato==1){
            System.out.println("(1) REGISTRAR (2)SALIR" );
            System.out.println("INGRESE UNA OPCIÓN : ");
            proceso= datos.nextInt();
            Factory SB= Factory.getFactory(proceso);

            System.out.println("Desea continuar : (1) Si/ (2) NO");
            dato = datos.nextInt();
            if (proceso == 2){
                break;
            }

        }

    }
}
