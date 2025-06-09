package PracticoTemplateComposite.punto5;

public class RemeraImportada extends Remera {

    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargos() {
        return precioUnitario * 0.03 + precioUnitario * 0.05;
    }

    @Override
    protected double calcularBonificacion() {
        return 0;
    }

    @Override
    protected double porcentajeGanancia() {
        return 0.25;

    }

}
