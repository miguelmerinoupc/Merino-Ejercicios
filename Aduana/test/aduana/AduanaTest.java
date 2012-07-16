
package aduana;

import junit.framework.Assert;
import org.junit.Test;


public class AduanaTest {
    Producto[] productos; 
    productos = new Producto[3];
    productos[0] = new Producto("001","A","Camioneta",1500);
    productos[1] = new Producto("002","B","Loza",100);
    productos[2] = new Producto("003","c","Cama",250);
    
    @Test
    public void DebeDeTenerNombre() {
        Assert.assertNotNull(productos[1].getCodigo());
    }
}
