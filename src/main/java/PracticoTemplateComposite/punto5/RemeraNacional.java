package PracticoTemplateComposite.punto5;

public class RemeraNacional extends Remera {
    private double costoTransporte;

    public RemeraNacional(double precioUnitario, double costoTransporte) {
        super(precioUnitario);
        this.costoTransporte = costoTransporte;
    }

    @Override
    protected double calcularRecargos() {
        return costoTransporte * 0.015;
    }

    @Override
    protected double calcularBonificacion() {
        return precioUnitario * 0.20;
    }

    @Override
    protected double porcentajeGanancia() {
        return 0.15;
    }
}
