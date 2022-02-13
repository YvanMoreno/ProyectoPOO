package trabajoF;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factory {

    public static Factory getFactory(int proceso){

        String fecha;
        double tiempo;
        String placa;
        String modelo;
        int estado;
        int tipoServicio;
        String mes;
        int dato=1;
        Scanner datos = new Scanner(System.in);
        Cochera registros=new Cochera();


        while (dato==1){
            Scanner INFO = new Scanner(System.in);

            if (proceso==1){

                System.out.println("Ingrese la fecha de atención : ");
                fecha = INFO.nextLine();

                System.out.println("Ingrese la placa: ");
                placa= INFO.nextLine();

                System.out.println("Ingrese el modelo:");
                modelo= INFO.nextLine();

                System.out.println("Ingrese el estado: (1) PAGADO (0) POR PAGAR ");
                estado= INFO.nextInt();

                System.out.println("Ingrese el tipo de servicio:  (1) DIA (2)NOCHE (3)MENSUAL (4)SALIR");
                tipoServicio= INFO.nextInt();




                if (tipoServicio == 1) {
                    System.out.println("Ingrese el tiempo en horas: ");
                    tiempo= INFO.nextDouble();
                    Dia nuevo1=new Dia(fecha,placa,modelo,estado,tiempo);
                    System.out.println("El precio a cancelar es:"+nuevo1.Calcularprecio());
                    registros.registrar(nuevo1);


                }

                else if (tipoServicio == 2) {
                    Noche nuevo2=new Noche(fecha,placa,modelo,estado);
                    System.out.println("El precio a cancelar es:"+nuevo2.Calcularprecio());
                    registros.registrar(nuevo2);
                }

                else if (tipoServicio == 3) {
                    System.out.println("Ingrese el mes: ");
                    mes= INFO.nextLine();
                    mensual nuevo3=new mensual(fecha,placa,modelo,estado,mes);
                    System.out.println("El precio a cancelar es:"+nuevo3.Calcularprecio());
                    registros.registrar(nuevo3);
                }
                registros.listar();
                System.out.println("Desea continuar : (1) Si/ (2) NO");
                dato = datos.nextInt();


            }


            else if (proceso==2){
                System.out.println("SALIENDO...");
                break;
            }

        }


        return null;

    }



}





