
package Tarea;

/**
 *
 * @author Kendall_Guzmán
 */
public class Triangulo extends Figura implements Comparable<Figura> {
    private final int LADOS;
    private final double base;
    private final double altura;

    public Triangulo(double base,double altura) {
        this.base=base;
        this.altura=altura;
        this.LADOS = 3;
    }
    
    @Override
    public double calcularArea() {
        return (base*altura)/2;
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
