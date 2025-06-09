package PracticoTemplateComposite.punto3;

public class Vida implements Seguro {

    private String decripcion;
    private double precioBase;

    public Vida(String decripcion, double precioBase) {
        this.decripcion = decripcion;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularSeguro() {
        return precioBase;
    }
}
