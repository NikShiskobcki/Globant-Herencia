package Models;

public class Lavadora extends Electrodomestico{
    protected double carga;

    public Lavadora(){

    }

    public Lavadora(Integer precio, String color, Character consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
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

        if (this.getCarga()>30){
            this.setPrecio(this.getPrecio()+500);
        }

        return this.getPrecio();
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
