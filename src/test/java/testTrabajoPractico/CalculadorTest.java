package testTrabajoPractico;

import PracticoTemplateComposite.punto4.CalcularJubilado;
import PracticoTemplateComposite.punto4.CalcularNoJubilado;
import PracticoTemplateComposite.punto4.LogTransaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void test01() {

        var calculador = new CalcularJubilado();
        calculador.setMesEnPromocion(5); // Suponiendo mayo como mes de promoción
        calculador.setLog(new LogTransaction());

        double esperado = 1000;

        assertEquals(esperado, calculador.calcularPrecio(1000));

    }

    @Test
    public void test02() {
        var calculador = new CalcularNoJubilado();
        calculador.setMesEnPromocion(5); // mayo
        calculador.setLog(new LogTransaction());

        double esperado = 1150;

        assertEquals(esperado, calculador.calcularPrecio(1000));
    }

}


