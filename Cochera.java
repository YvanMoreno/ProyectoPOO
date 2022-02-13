package trabajoF;

import java.util.ArrayList;
import java.util.List;

public class Cochera {
    List<Sistema> registro;

    public Cochera() {
        this.registro=new ArrayList<>();
    }
    public Sistema obtenerDatos(String placa){
        for (Sistema x:registro){
            if (x.getPlaca().equals(placa)){
                return x;
            }
        }
        return null;
    }

    public Sistema buscar(String fecha){
        for (Sistema x:registro){
            if (x.getFecha().equals(fecha)){
                return x;
            }
        }
        return null;
    }

    public void registrar(Sistema x){

        registro.add(x);


    }
    public void listar(){

        for (Sistema x:registro){

            System.out.println("FECHA: "+x.getFecha()+ " PLACA: "+x.getPlaca()+" PRECIO:"+x.Calcularprecio() );



        }

    }
}
