package PracticoTemplateComposite.punto2;

public class Tarea implements ItemTrabajo {

    private String nombre;
    private int tiempo;

    public Tarea(String nombre, int tiempo) {

        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public int calcularTiempo() {
        return tiempo;

    }
}
