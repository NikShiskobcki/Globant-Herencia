import Models.*;
import Service.*;

public class Main {
    public static void main(String[] args) {

        Lavadora lavadora = LavadoraService.crearLavadora();
        Televisor televisor = TelevisorService.crearTelevisor();

        System.out.println(lavadora.toString());
        System.out.println(televisor.toString());
    }
}