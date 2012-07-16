/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package movie;

public class MovieTestDrive {
   
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Lo que el viento se llevo";
        one.genre = "Drama";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "La Guarderia de Papa";
        two.genre = "Comedia";
        two.rating = 5;
        Movie trhee = new Movie();
        trhee.title = "yo Robot";
        trhee.genre = "Ficción";
        trhee.rating = 127;
        if (one.rating > two.rating)
        {
            if (one.rating > trhee.rating)
            {
                one.playIt();
            }
            else
            {
                if (two.rating > trhee.rating)
                {
                    two.playIt();
                }
                else
                {
                    trhee.playIt();
                }
            }
        }
        else
        {
            if (two.rating > trhee.rating)
                {
                    two.playIt();
                }
                else
                {
                    trhee.playIt();
                }
        }
        
    }

}
