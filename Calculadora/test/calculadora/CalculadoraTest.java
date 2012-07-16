package calculadora;

import junit.framework.Assert;
import org.junit.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();
         @Test
         public void laSumade5y7meDebeDar10(){
           int valorEsperado = 5 + 7;
           int valorObtenido = 0;
           valorObtenido = calculadora.suma(5,7);
           Assert.assertEquals(valorEsperado,valorObtenido);
         }
        @Test
        public void lasumade3y6meDebedar9(){
           int valorEsperado = 3 + 6;
           int valorObtenido = 0;
           valorObtenido = calculadora.suma(3,6);
           Assert.assertEquals(valorEsperado,valorObtenido);
        }
         @Test
        public void larestaDeDosNumerosDebeDarLaResta(){
           int valorEsperado = -5;
           int valorObtenido = 0;
           
           valorObtenido = calculadora.resta(3,8);
           Assert.assertEquals(valorEsperado,valorObtenido);
        } 
}
