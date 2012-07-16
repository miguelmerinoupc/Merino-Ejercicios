
package aduana;


public class Producto {
    String codigo;
    String lote;
    String descripcion;
    double costo;

    public Producto(String codigo, String lote, String descripcion, double costo) {
        this.codigo = codigo;
        this.lote = lote;
        this.descripcion = descripcion;
        this.costo = costo;
    }


    
    public String getCodigo() {
        return codigo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLote() {
        return lote;
    }
    
    
            
}
