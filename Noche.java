package trabajoF;

public class Noche extends Sistema{
    public Noche(String fecha, String placa, String modelo, int estado) {
        super(fecha, placa, modelo, estado);
    }

    @Override
    public double Calcularprecio(){
        double total=20;
        return total;
    }
}
