package trabajoF;

public class Dia extends Sistema {
    private double tiempo;

    public Dia(String fecha, String placa, String modelo, int estado, double tiempo) {
        super(fecha, placa, modelo, estado);
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "tiempo=" + tiempo +
                '}';
    }
    @Override
    public double Calcularprecio(){
        double total=tiempo*4.50;
        return total;
    }


}
