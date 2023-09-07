package Models;

public class Velero extends Barco{
    protected int cantidadMastiles;

    public Velero(String matricula, int longitud, int fabricationYear, int cantidadMastiles) {
        super(matricula, longitud, fabricationYear);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }
    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "cantidadMastiles=" + cantidadMastiles +
                ", matricula='" + matricula + '\'' +
                ", longitud=" + longitud +
                ", fabricationYear=" + fabricationYear +
                '}';
    }
}
