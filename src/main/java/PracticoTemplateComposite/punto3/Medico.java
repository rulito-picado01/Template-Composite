package PracticoTemplateComposite.punto3;

public class Medico implements Seguro {
    private String decripcion;
    private double precioBase;

    public Medico(String decripcion, double precioBase) {
        this.decripcion = decripcion;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularSeguro() {
        return precioBase;
    }
}
