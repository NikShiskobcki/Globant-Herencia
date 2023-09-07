package Services;
import Models.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class AlquilerService {
    public static Alquiler generarAlquiler(Barco barco){
        Scanner rd = new Scanner(System.in);
        Alquiler alquiler = new Alquiler();

        System.out.println("Ingrese nombre del cliente");
        alquiler.setNombre(rd.nextLine());

        System.out.println("Ingrese documento del cliente");
        alquiler.setDocumento(rd.nextInt());
        rd.nextLine();

        System.out.println("Ingrese fecha del alquiler(yyyy-mm-dd)");
        alquiler.setFechaAlquiler(LocalDate.parse(rd.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println("Ingrese fecha de devolucion(yyyy-mm-dd)");
        alquiler.setFechaDevolucion(LocalDate.parse(rd.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println("Ingrese posicion del amarre");
        alquiler.setAmarre(rd.nextInt());
        rd.nextLine();

        alquiler.setBarco(barco);

        return alquiler;
    }


    //Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    //alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    //multiplicando por 10 los metros de eslora).
    //En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    //sumándole el atributo particular de cada barco.
    // En los veleros se suma el número de mástiles,
    //en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    //el número de camarotes.

    public static int costoAlquiler(Alquiler alquiler){
        int dias = diferenciaDias(alquiler);

        int modulo = diferenciaDias(alquiler) * (alquiler.getBarco().getLongitud()*10);

        if (alquiler.getBarco() instanceof Velero){
            modulo += ((Velero) alquiler.getBarco()).getCantidadMastiles();
        }

        if (alquiler.getBarco() instanceof BarcoAMotor){
            modulo += ((BarcoAMotor) alquiler.getBarco()).getPotenciaCV();
        }

        if (alquiler.getBarco() instanceof Yate){
            modulo += ((Yate) alquiler.getBarco()).getPotenciaCV();
            modulo += ((Yate) alquiler.getBarco()).getCamarotes();
        }

        return modulo;

    }

    private static int diferenciaDias(Alquiler alquiler){

        long difDias = DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion());

        int dias = Math.toIntExact(difDias) ;
        return dias;
    }

}
