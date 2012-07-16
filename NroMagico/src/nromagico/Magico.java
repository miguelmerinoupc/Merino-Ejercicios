/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nromagico;


public class Magico {
    int dia;
    int mes;
    int anho;
    int nromagico;

    public Magico(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
        CalculaNroMagico();
    }

    public int getAnho() {
        return anho;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getNromagico() {
        return nromagico;
    }



    public void CalculaNroMagico()
    {
     //int nromagico = 0;
     // Iniciando calculo con dia de fecha
     if (this.getDia() <10)
     {
      nromagico = nromagico + this.getDia();
     }
     else
      {
       nromagico = nromagico + ((this.getDia()/10)+(this.getDia()%10));
      }
     // Calculando con mes de fecha
     if (this.getMes() <100)
     {
      nromagico = nromagico + ((this.getMes()/10)+(this.getMes()%10));
     }
     //Calculando con el año
     if (this.getAnho() <2012)
     {
      int miles, centena, decena, unidad;
      miles = (this.getAnho()/1000);
      centena = ((this.getAnho()-(miles*1000))/100);
      decena = (((this.getAnho() - (miles*1000))- (centena*100))/10);
      unidad = (((this.getAnho() - (miles*1000))- (centena*100))%10);
      nromagico = nromagico + miles + centena + decena + unidad;
     }
     //Preguntar si numero sigue siendo mayor a 10
     if (nromagico >9)
     {
      nromagico = ((nromagico/10)+(nromagico%10));
     }
     
  }

}
