
package Tarea;

import java.util.Arrays;

/**
 *
 * @author Kendall_Guzmán
 */
public class Geometrias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo fig1 = new Rectangulo(2.5, 3.0);
        Circulo fig2= new Circulo(3);
        Rectangulo fig3= new Rectangulo(2.5,3);
        Rectangulo fig4= new Rectangulo(2,3);
        Triangulo fig5= new Triangulo(3,5);
        System.out.println(fig1.compareTo(fig2));
        System.out.println(fig1.compareTo(fig3));
        System.out.println(fig1.compareTo(fig4));
        System.out.println(fig1.compareTo(fig5));

        
        
    }
    
}
