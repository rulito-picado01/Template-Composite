package testTrabajoPractico;

import PracticoTemplateComposite.punto3.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroTest {

    @Test
    public void test01() {
        var paquete1 = new PaqueteSeguro("paquete1");
        var paquete2 = new PaqueteSeguro("paquete02");

        var seguroAuto = new Automovil("RENAUL", 800);
        var seguroHogar = new Hogar("CASA", 100);
        var seguroMedico = new Medico("TODO CUVIRTO ", 500);
        var segutoVida = new Vida("muerte", 1000);

        paquete1.agregarSeguroPaquete(seguroAuto);
        paquete1.agregarSeguroPaquete(seguroHogar);
        paquete1.agregarSeguroPaquete(seguroMedico);
        paquete1.agregarSeguroPaquete(segutoVida);

        double total = 1920;

        assertEquals(total, paquete1.calcularSeguro());
    }

    @Test
    public void test02() {
        var paquete1 = new PaqueteSeguro("paquete1");
        var paquete2 = new PaqueteSeguro("paquete02");

        var seguroAuto = new Automovil("RENAUL", 800);
        var seguroHogar = new Hogar("CASA", 100);
        var seguroMedico = new Medico("TODO CUVIRTO ", 500);
        var segutoVida = new Vida("muerte", 1000);

        paquete1.agregarSeguroPaquete(seguroAuto);
        paquete1.agregarSeguroPaquete(seguroHogar);
        paquete1.agregarSeguroPaquete(seguroMedico);
        paquete1.agregarSeguroPaquete(segutoVida);

        paquete2.agregarSeguroPaquete(segutoVida);

        double total = 1920;

        assertEquals(total, paquete1.calcularSeguro());

        assertEquals(1000, paquete2.calcularSeguro());
    }

}
