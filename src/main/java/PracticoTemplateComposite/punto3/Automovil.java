package PracticoTemplateComposite.punto3;

public class Automovil implements Seguro {

    private String descripcion;
    private double precioBase;

    public Automovil(String descripcion, double precioBase) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularSeguro() {
        return precioBase;
    }
}
