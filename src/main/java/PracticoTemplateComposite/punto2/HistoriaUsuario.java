package PracticoTemplateComposite.punto2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements ItemTrabajo {

    private String nombre;
    private List<ItemTrabajo> items = new ArrayList<>();

    public HistoriaUsuario(String nombre) {

        this.nombre = nombre;
    }

    public void agregatItems(ItemTrabajo i) {
        items.add(i);
    }

    @Override
    public int calcularTiempo() {
        int totalHoras = 0;
        for (ItemTrabajo i : items) {
            totalHoras += i.calcularTiempo();
        }
        return totalHoras;
    }
}
