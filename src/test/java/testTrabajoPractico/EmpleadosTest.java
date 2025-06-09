package testTrabajoPractico;

import PracticoTemplateComposite.punto1.EmpleadoCargo;
import PracticoTemplateComposite.punto1.EmpleadoRegular;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadosTest {

    @Test
    public void test01() {
        EmpleadoRegular empleado1 = new EmpleadoRegular("Facundo", 1000);


        EmpleadoCargo lider = new EmpleadoCargo("Nicolas", "Líder", 2000);
        lider.agregarEmpleadoACargo(empleado1);


        EmpleadoCargo mando = new EmpleadoCargo("Agustin", "Mando medio", 3000);
        mando.agregarEmpleadoACargo(lider);


        EmpleadoCargo gerente = new EmpleadoCargo("Francisco", "Gerente", 4000);
        gerente.agregarEmpleadoACargo(mando);


        EmpleadoCargo director = new EmpleadoCargo("Gustavo", "Director", 5000);
        director.agregarEmpleadoACargo(gerente);

        double total = director.calcularSueldo();
        //Esperado: 5000 + 4000 + 3000 + 2000 + 1000 = 15000
        double esperado = 15000;
        assertEquals(esperado, total);
    }

    @Test
    public void test02() {
        EmpleadoRegular empleado1 = new EmpleadoRegular("Ana", 1000);
        EmpleadoRegular empleado2 = new EmpleadoRegular("Luis", 1100);


        EmpleadoCargo lider1 = new EmpleadoCargo("Francisco", "Líder", 2000);
        lider1.agregarEmpleadoACargo(empleado1);

        EmpleadoCargo lider2 = new EmpleadoCargo("Cristobal", "Líder", 2100);
        lider2.agregarEmpleadoACargo(empleado2);


        EmpleadoCargo mando1 = new EmpleadoCargo("Lautaro", "Mando medio", 3000);
        mando1.agregarEmpleadoACargo(lider1);

        EmpleadoCargo mando2 = new EmpleadoCargo("Juana", "Mando medio", 3100);
        mando2.agregarEmpleadoACargo(lider2);


        EmpleadoCargo gerente1 = new EmpleadoCargo("luisa", "Gerente", 4000);
        gerente1.agregarEmpleadoACargo(mando1);

        EmpleadoCargo gerente2 = new EmpleadoCargo("Paola", "Gerente", 4200);
        gerente2.agregarEmpleadoACargo(mando2);


        EmpleadoCargo director1 = new EmpleadoCargo("Juan", "Director", 5000);
        director1.agregarEmpleadoACargo(gerente1);

        EmpleadoCargo director2 = new EmpleadoCargo("Paula", "Director", 5500);
        director2.agregarEmpleadoACargo(gerente2);

        double total = director1.calcularSueldo() + director2.calcularSueldo();

        double resultado = 31000;
        assertEquals(resultado, total);

    }
}


