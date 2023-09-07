package Models;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int amarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", amarre=" + amarre +
                ", barco=" + barco +
                '}';
    }


}
