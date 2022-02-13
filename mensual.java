package trabajoF;

public class mensual extends Sistema{
    private String mes;

    public mensual(String fecha, String placa, String modelo, int estado, String mes) {
        super(fecha, placa, modelo, estado);
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "mensual{" +
                "mes='" + mes + '\'' +
                '}';
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    @Override
    public double Calcularprecio(){
        double total=350;
        return total;
    }
}