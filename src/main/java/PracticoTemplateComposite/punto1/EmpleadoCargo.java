package PracticoTemplateComposite.punto1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCargo implements Empleado {

    private String nombre;
    private String rol;
    private double sueldo;
    private List<Empleado> subEmpleados = new ArrayList<>();

    public EmpleadoCargo(String nombre, String rol, double sueldo) {
        this.nombre = nombre;
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public void agregarEmpleadoACargo(Empleado e) {
        subEmpleados.add(e);
    }

    @Override
    public double calcularSueldo() {
        double total = sueldo;
        for (Empleado e : subEmpleados) {
            total += e.calcularSueldo();
        }
        return total;
    }
}
