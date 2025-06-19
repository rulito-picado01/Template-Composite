package testTrabajoPractico;

import PracticoTemplateComposite.punto5.RemeraImportada;
import PracticoTemplateComposite.punto5.RemeraNacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemerasTest {

    @Test
    public void test01() {
        RemeraImportada importada = new RemeraImportada(1000);


        assertEquals(1350, importada.calcularPrecioVenta());
    }

    @Test
    public void test02() {


        RemeraNacional nacional = new RemeraNacional(800, 200);


        assertEquals(739.4499999999999, nacional.calcularPrecioVenta());
    }

}
