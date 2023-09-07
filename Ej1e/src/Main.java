import Models.*;
import Services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        //barcos
        Velero velero = new Velero("A12", 20, 2004, 4);
        BarcoAMotor barcoMotor = new BarcoAMotor("B10", 15, 2006, 10);
        Yate yate = new Yate("Y60", 50, 2010, 20, 5);

        Alquiler alquiler;


        System.out.println("Seleccione un barco para alquilar (1/2/3)");

        System.out.println("1:");
        System.out.println(velero.toString());

        System.out.println("2:");
        System.out.println(barcoMotor.toString());

        System.out.println("3:");
        System.out.println(yate.toString());
        int op;

        op = rd.nextInt();
        rd.nextLine();

        if (op<1||op>3){
            do {
                System.out.println("Opcion no valida. Ingrese 1, 2 o 3");
                op = rd.nextInt();
                rd.nextLine();
            }while (op<1||op>3);
        }

        if (op == 1){
            alquiler = AlquilerService.generarAlquiler(velero);
        }else if (op == 2){
            alquiler = AlquilerService.generarAlquiler(barcoMotor);
        }else {
            alquiler = AlquilerService.generarAlquiler(yate);
        }

        int costoAlquiler = AlquilerService.costoAlquiler(alquiler);
        System.out.println("El costo final de su alquiler es de: " + costoAlquiler);






    }
}