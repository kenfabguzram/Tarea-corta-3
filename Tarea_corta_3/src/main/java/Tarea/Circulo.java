
package Tarea;
/**
 *
 * @author Kendall_Guzmán
 */
public class Circulo extends Figura implements Comparable<Figura>{
    private final double radio;
    private final int LADOS;
    /**
     *
     * @param radio
     */

    public Circulo(double radio) {
        this.radio = radio;
        LADOS=1;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public int getLados() {
        return LADOS;
    }

    @Override
    public int compareTo(Figura figuraPorComparar) {
        double areaPorComparar = figuraPorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (this.getLados()!=figuraPorComparar.getLados()){
                return -2;
            }
            else{
                return 0;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    
}
