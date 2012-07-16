

import calcula.Aplicacion;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculaareaTest {
    Aplicacion apli1 = new Aplicacion("AreaCuadrado",10.00);
    Aplicacion apli2 = new Aplicacion("AreaCirculo",10.00);
    Aplicacion apli3 = new Aplicacion("Factorial",5.00);
    Aplicacion apli4 = new Aplicacion("NroPrimo",4.00);

    @Test
    public void DebeTenerNombreDeAplicacion() {
        //Aplicacion apli1 = new Aplicacion("AreaCuadrado");
        assertNotNull(apli1.getNombre());
    }

    @Test
    public void DebeTenerValorLaAplicacion() {
       // Aplicacion apli1 = new Aplicacion("AreaCuadrado");
        assertNotNull(apli1.getValor());
    }
    @Test
    public void DebeCalcularAreaDelCuadradoDebeDeDar100() {
        assertEquals(100.00, apli1.getResultado(),1e-6);

    }

    @Test
    public void DebeCalcularAreaDelCirculo() {
        assertEquals(314.1592653, apli2.getResultado(),1e-6);
    }
    
    @Test
    public void DebeCalcularFactorial() {
        assertEquals(120, apli3.getResultado(),1e-6);
    }

    @Test
    public void DebeCalcularNroPrimo() {
        assertEquals(true, apli4.getPrimo());
    }
}