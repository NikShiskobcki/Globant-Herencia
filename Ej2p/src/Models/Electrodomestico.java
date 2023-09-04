package Models;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
    protected Integer precio = 1000;
    protected String color;
    protected Character consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }
    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static char comprobarConsumoElectrico(char letra){
        if (!(letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F')){
            letra = 'F';
        }
        return letra;
    }

    public static String comprobarColor(String color){
        color = color.toLowerCase();
        if (!(color.equals("blanco")||color.equals("negro")||color.equals("rojo")||color.equals("azul")||color.equals("gris"))){
            color = "blanco";
        }
        return color;
    }

    public static Electrodomestico crearElectrodomestico(){
        Scanner rd = new Scanner(System.in);
        //precio color consumo peso
        Electrodomestico el = new Electrodomestico();


        System.out.println("Ingrese color del electrodomestico");
        String color = rd.nextLine().toLowerCase();
        color = comprobarColor(color);
        el.setColor(color);

        System.out.println("Ingrese consumo del electrodomestico(A-F)");
        char consumo = rd.next().charAt(0);
        consumo = comprobarConsumoElectrico(consumo);
        el.setConsumo(consumo);
        rd.nextLine();

        System.out.println("Ingrese el peso del electrodomestico");
        el.setPeso(rd.nextDouble());
        rd.nextLine();

        return el;

    }

     public int precioFinal(){
        switch(this.getConsumo()){
            case 'A':
                this.setPrecio(this.getPrecio()+1000);
                break;
            case 'B':
                this.setPrecio(this.getPrecio()+800);
                break;
            case 'C':
                this.setPrecio(this.getPrecio()+600);
                break;
            case 'D':
                this.setPrecio(this.getPrecio()+500);
                break;
            case 'E':
                this.setPrecio(this.getPrecio()+300);
                break;
            default:
                this.setPrecio(this.getPrecio()+100);
        }

        double p = this.getPeso();
        if (p>=1 && p<=19){
            this.setPrecio(this.getPrecio()+100);
        }
        if (p>=20 && p<=49){
            this.setPrecio(this.getPrecio()+500);
        }
        if (p>=50 && p<=79){
            this.setPrecio(this.getPrecio()+800);
        }
        if (p>=80 ){
            this.setPrecio(this.getPrecio()+1000);
        }

        return this.getPrecio();
    }

}
