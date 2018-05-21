package videojuego;

/** Clase para crear selenita
 *
 * Esta clase se diseñó específicamente para la parte práctica de un examen
 * 
 * @author Jesus Diego Cruz
 * @version v1.0
 * @see <a href="https://github.com/Diegocd/Prueba-4">Github</a>
 */

public class Selenita extends Extraterrestre implements DominarPlaneta {

    private String armamento;
    /** Método para controlar terrícola
     * 
     */
    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Aniquilar terrícola");
        dispararArma();
    }
    /** Método para disparar arma
     *  
     *
     */
    public void dispararArma() {
        if (armamento.equals("cañon láser")) {
            System.out.println("BOUMMM");
        } else {
            System.out.print("Bzzzzzz");
        }
    }
    
    /** Constructor con parámetros
     * @param armamento define el armamento que utiliza
     *
     */
    
    public Selenita(String armamento) {
        super(2, 1, "Azul");
        this.armamento = armamento;
    }
    
    /** Método para cambiar el armamento
     *  @param armamento define el nuevo armamento que utiliza
     */
    public void asignarArmamento(String armamento) {
        this.armamento = armamento;
    }
    
    /** Método para proclamar gobierno
     * @param planeta define el planeta en el que se eliminaran los gobernantes y 
     * se gobernará
     */
    
    public void proclamarGobierno(String planeta) {
        System.out.println("Eliminar gobernantes del planeta:" + planeta);
        System.out.println("Gobernamos sobre el planeta " + planeta);
    }
    
    /** Método para aniquilar población
     *  @param planeta define el planeta en el que utilizar armas nucleares
     */
    
    public void aniquilarPoblacion(String planeta) {
        System.out.println("Utilización de armas nucleares sobre el planeta " + planeta);
    }
    
    /** Método para controlar los recursos de un planeta
     * @param planeta define el planeta al que controlar los recursos
     */
    
    public void controlarRecursos(String planeta) {
    }
}
