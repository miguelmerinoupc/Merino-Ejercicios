/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package movie;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Correr la pelicula " + this.title);
    }

}
