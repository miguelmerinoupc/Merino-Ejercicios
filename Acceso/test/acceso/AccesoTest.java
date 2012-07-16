/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import junit.framework.Assert;
import org.junit.Test;


public class AccesoTest {
    Usuario usuario1 = new Usuario("Miguel","123456");
    Usuario usuario2 = new Usuario("Enmanuel","098765");
    
    @Test
    public void validarquenoestenvacios() {
        Usuario usuario1 = new Usuario("Miguel","123456");
        Assert.assertnotnull(Usuario.nombre);
    }
}
