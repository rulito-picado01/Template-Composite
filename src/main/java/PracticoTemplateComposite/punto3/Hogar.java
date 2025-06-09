package PracticoTemplateComposite.punto3;

public class Hogar implements Seguro {

    private String decripcion;
    private double precioBase;

    public Hogar(String decripcion, double precioBase) {
        this.decripcion = decripcion;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularSeguro() {
        return precioBase;
    }
}
