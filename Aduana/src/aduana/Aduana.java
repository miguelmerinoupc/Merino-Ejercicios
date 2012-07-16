
package aduana;

/**
 *
 * @author Miguel Merino Barreto - u201216787
 */
public class Aduana {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Producto productos = new Producto("001","A","Camioneta",1500);
        Producto[] productos; 
        productos = new Producto[3];
        productos[0] = new Producto("001","A","Camioneta",1500);
        productos[1] = new Producto("002","B","Loza",100);
        productos[2] = new Producto("003","C","Cama",250);
        double varimp, vartimp;
        vartimp = 0;
        //System.out.println(productos.length);
        for(int i=0; i<productos.length; i++){
             if (productos[i].getCosto()<= 200){
          varimp = productos[i].getCosto()*0.12;
        }
        else{
          varimp = productos[i].getCosto()*0.25;
        }
             vartimp = vartimp + varimp;
             System.out.println("Producto : " + productos[i].getCodigo() + " " + productos[i].getDescripcion() + " Lote : " + productos[i].getLote());
             System.out.flush();
             System.out.println("Costo : " + productos[i].getCosto() + " Impuesto : " + varimp);
	}
        System.out.println("Total a pagar por impuestos es : " + vartimp);
    }
}
