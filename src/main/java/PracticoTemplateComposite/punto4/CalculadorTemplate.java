package PracticoTemplateComposite.punto4;

public abstract class CalculadorTemplate implements Calculador {

    protected LogTransaction log;
    protected int mesEnPromocion;

    @Override
    public final double calcularPrecio(double precioProducto) {
        double iva = calcularIVA(precioProducto);
        double precioTotal = precioProducto + iva;

        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract double calcularIVA(double precioProducto);


    public void setLog(LogTransaction log) {
        this.log = log;
    }


    public void setMesEnPromocion(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }
}
