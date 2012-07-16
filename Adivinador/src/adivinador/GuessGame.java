/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adivinador;


public class GuessGame {
    Player p1;
	   Player p2;
	   Player p3;

	   public void startGame() {
	       p1 = new Player();
	       p2 = new Player();
	       p3 = new Player();

	       int guessp1 = 0;
	       int guessp2 = 0;
	       int guessp3 = 0;

	       boolean p1isRight = false;
	       boolean p2isRight = false;
	       boolean p3isRight = false;

	       int targetNumber = (int) (Math.random() * 10);
	       System.out.println ("Yo estoy pensando en un numero entre 0 y 9...");

	       while(true) {
	           System.out.println("El numero a adivinar es " + targetNumber);
	           p1.guess();
	           p2.guess();
	           p3.guess();

	           guessp1 = p1.number;
	           System.out.println("El primer jugador adivina " + guessp1);
	           guessp2 = p2.number;
	           System.out.println("El segundo jugador adivina " + guessp2);
	           guessp3 = p3.number;
	           System.out.println("El tercer jugador adivina " + guessp3);

	           if (guessp1 == targetNumber) {
	               p1isRight = true;
	           }
	           if (guessp2 == targetNumber) {
	               p2isRight = true;
	           }
	           if (guessp3 == targetNumber) {
	               p3isRight = true;
	           }

	           if (p1isRight || p2isRight || p3isRight)
	           {
	               System.out.println("Nosotros tenemos un Jugador!");
	               System.out.println("¿El Jugador 1 gano? " + p1isRight);
	               System.out.println("¿El jugador 2 gano? " + p2isRight);
	               System.out.println("¿El jugador 3 gano? " + p3isRight);
	               System.out.println("El juego ha finalizado.");
	               break; // game over, so break out of the loop
	           }
	           else {
	        	   // Nadie ha adivinado, nos mantenemos en el juego aun!
	               System.out.println("Los jugadores probaran otra vez.");
	           } // end if/else


	       }

	   }

}
