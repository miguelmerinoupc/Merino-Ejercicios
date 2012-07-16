/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcula;

public class Aplicacion {
    private String Nombre;
    private double Valor;
    private double resultado;
    private Boolean primo;

    public Aplicacion(String Nombre, double Valor) {
        this.Nombre = Nombre;
        this.Valor = Valor;
        CalculaResultado();
    }

    

    public String getNombre() {
        return Nombre;
    }

    public double getValor() {
        return Valor;
    }

    public double getResultado() {
        return resultado;
    }

    public double getPrimo() {
        return resultado;
    }

        
    public void CalculaResultado() {
        if (this.Nombre == "AreaCuadrado")
        {
          resultado = this.Valor * this.Valor;
        }
        if (this.Nombre == "AreaCirculo")
        {
           resultado = Math.PI * (this.Valor*this.Valor);
        }

        if (this.Nombre == "Factorial")
        {
            double numero = 0;
            resultado = this.Valor;
            numero = this.Valor - 1;
            while (numero!=0) {
             resultado = resultado * numero;
             numero--;
            }
        }

        if (this.Nombre == "NroPrimo")
        {
        int contador = 2;
        this.primo = true;
        while ((this.primo) && (contador!= this.Valor))
         {
           if (this.Valor % contador == 0)
           {
            System.out.println("Nro Noes primo " + this.Valor);
            this.primo = false;
            contador++;
            System.out.println("Verdadero o Falso? " + this.primo);
           }
           if (this.primo == false) {
                   break;
             }
         }
        }
        
    }

}
