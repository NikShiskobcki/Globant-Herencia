package Models;

public class Barco {
    protected String matricula;
    protected int longitud;
    protected int fabricationYear;

    public Barco(){

    }

    public Barco(String matricula, int longitud, int fabricationYear) {
        this.matricula = matricula;
        this.longitud = longitud;
        this.fabricationYear = fabricationYear;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", longitud=" + longitud +
                ", fabricationYear=" + fabricationYear +
                '}';
    }
}
