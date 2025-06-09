package PracticoTemplateComposite.punto2;

public class Spike implements ItemTrabajo {

    private String Descripcion;
    private int tiempo;

    public Spike(String descripcion, int tiempo) {

        this.Descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public int calcularTiempo() {
        return tiempo;
    }

}
