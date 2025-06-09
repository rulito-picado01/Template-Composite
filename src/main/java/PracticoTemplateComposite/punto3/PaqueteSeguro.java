package PracticoTemplateComposite.punto3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements Seguro {

    public static final double DESCUENTO_INICIAL_POR_SEGURO = 0.05;
    private String descripcion;
    private List<Seguro> seguros = new ArrayList<>();

    public PaqueteSeguro(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarSeguroPaquete(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public double calcularSeguro() {
        double total = 0;
        for (Seguro s : seguros) {
            total += s.calcularSeguro();
        }
        if (seguros.size() > 1) {
            double descuento = seguros.size() * DESCUENTO_INICIAL_POR_SEGURO;
            total = total * (1 - descuento);
        }
        return total;
    }
}
