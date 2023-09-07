package Models;

public class Yate extends Barco{
    protected int potenciaCV;
    protected int camarotes;

    public Yate(String matricula, int longitud, int fabricationYear, int potenciaCV, int camarotes) {
        super(matricula, longitud, fabricationYear);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "potenciaCV=" + potenciaCV +
                ", camarotes=" + camarotes +
                ", matricula='" + matricula + '\'' +
                ", longitud=" + longitud +
                ", fabricationYear=" + fabricationYear +
                '}';
    }
}
