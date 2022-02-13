package trabajoF;

public class Sistema {
    private String fecha;
    private String placa;
    private String modelo;
    private int estado;

    public Sistema(String fecha, String placa, String modelo, int estado) {
        this.fecha = fecha;
        this.placa = placa;
        this.modelo = modelo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "fecha='" + fecha + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estado=" + estado +
                '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double Calcularprecio(){
        double total=0.0;
        return total;
    }


}
