package Service;

import Models.Electrodomestico;
import Models.Televisor;

import java.util.Scanner;

public class TelevisorService {

    public static Televisor crearTelevisor(){
        Scanner rd = new Scanner(System.in);
        Electrodomestico el = Electrodomestico.crearElectrodomestico();
        Televisor t = new Televisor();

        t.setColor(el.getColor());
        t.setPeso(el.getPeso());
        t.setConsumo(el.getConsumo());
        t.setPrecio(el.getPrecio());

        System.out.println("Ingrese resolucion del televisor");
        t.setResolucion(rd.nextInt());

        rd.nextLine();

        System.out.println("Ingrese si tiene sintonizador TDT(true/false)");
        t.setSintonizadorTDT(rd.nextBoolean());

        t.setPrecio(t.precioFinal());
        return t;
    }

}
