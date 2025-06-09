package PracticoTemplateComposite.punto5;

public abstract class Remera {

    protected double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecioVenta() {
        double precioFinal = calcularPrecioBase() + calcularRecargos() - calcularBonificacion();
        return precioFinal * (1 + porcentajeGanancia());
    }

    protected double calcularPrecioBase() {
        return precioUnitario;
    }

    protected abstract double calcularRecargos();

    protected abstract double calcularBonificacion();

    protected abstract double porcentajeGanancia();
}
