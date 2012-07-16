/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adivinador;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }

}
