package PracticoTemplateComposite.punto2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements ItemTrabajo {

    private String nombre;
    private List<ItemTrabajo> items = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public void agredarItems(ItemTrabajo i) {
        items.add(i);
    }

    @Override
    public int calcularTiempo() {

        int tiempo = 0;
        for (ItemTrabajo i : items) {
            tiempo = +i.calcularTiempo();
        }
        return tiempo;
    }
}