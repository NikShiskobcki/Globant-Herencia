package Models;

public class Televisor extends Electrodomestico{

    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer precio, String color, Character consumo, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
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

        if (this.sintonizadorTDT){
            this.setPrecio(this.getPrecio()+500);
        }

        if (this.getResolucion()>40){
            float pr = this.getPrecio();
            pr = pr + ((pr/100)*30);
            this.setPrecio(Math.round(pr));
        }

        return this.getPrecio();
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
