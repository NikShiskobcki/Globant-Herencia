package Service;
import Models.*;

import java.util.Scanner;

public class LavadoraService {

    public static Lavadora crearLavadora() {
        Scanner rd = new Scanner(System.in);
        Electrodomestico el = Electrodomestico.crearElectrodomestico();
        Lavadora lavadora = new Lavadora();

        lavadora.setColor(el.getColor());
        lavadora.setPeso(el.getPeso());
        lavadora.setConsumo(el.getConsumo());

        System.out.println("Ingrese carga de la lavadora");
        lavadora.setCarga(rd.nextDouble());
        rd.nextLine();

        lavadora.setPrecio(lavadora.precioFinal());

        return lavadora;
    }

}
