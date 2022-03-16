
package Tarea;

/**
 *
 * @author Kendall_Guzmán
 */

public class Rectangulo extends Figura implements Comparable<Figura>{
    private final double base;
    private final double altura;
    private final int LADOS;

    public Rectangulo(double base, double altura) {
        this.LADOS = 4;
        this.base = base;
        this.altura = altura;
    }


    /**
     *
     * @return
     */
    @Override
    public double calcularArea(){
      return base * altura;
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
    @Override
    public int getLados() {
        return LADOS;
    }
}