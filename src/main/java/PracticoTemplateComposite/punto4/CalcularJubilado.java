package PracticoTemplateComposite.punto4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalcularJubilado extends CalculadorTemplate {
    @Override
    protected double calcularIVA(double precioProducto) {
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            return precioProducto * 0.1;
        }
        return 0;
    }
}
