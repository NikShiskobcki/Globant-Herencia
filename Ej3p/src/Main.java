//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
import Models.*;
import Service.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora(1000, "blanco", 'E', 90, 30);
        Lavadora lavadora2 = new Lavadora(1000, "azul", 'D', 50, 20);
        Televisor televisor1 = new Televisor(1000, "blanco", 'F', 10, 65, true);
        Televisor televisor2 = new Televisor(1000, "negro", 'A', 10, 65, false);

        ArrayList<Electrodomestico> electrodomesticosList = new ArrayList<>();
        electrodomesticosList.add(televisor1);
        electrodomesticosList.add(televisor2);
        electrodomesticosList.add(lavadora1);
        electrodomesticosList.add(lavadora2);

        int precioTotalLavadoras = 0;
        int precioTotalTelevisores = 0;
        int precioTotalElectrodomesticos = 0;

        for (Electrodomestico electrodomestico: electrodomesticosList) {
            electrodomestico.precioFinal();
            if (electrodomestico instanceof Televisor){
                precioTotalTelevisores += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Lavadora){
                precioTotalLavadoras += electrodomestico.getPrecio();
            }
            precioTotalElectrodomesticos += electrodomestico.getPrecio();
            System.out.println(electrodomestico.toString());
        }

        System.out.println("");
        System.out.println("Precio total de los electrodomesticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras " + precioTotalLavadoras);
        System.out.println("Precio total televisores " + precioTotalTelevisores);



    }
}