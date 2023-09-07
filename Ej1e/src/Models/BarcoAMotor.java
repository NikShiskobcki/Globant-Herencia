package Models;

public class BarcoAMotor extends Barco{

    protected int potenciaCV;

    public BarcoAMotor(String matricula, int longitud, int fabricationYear, int potenciaCV) {
        super(matricula, longitud, fabricationYear);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" +
                "potenciaCV=" + potenciaCV +
                ", matricula='" + matricula + '\'' +
                ", longitud=" + longitud +
                ", fabricationYear=" + fabricationYear +
                '}';
    }
}
