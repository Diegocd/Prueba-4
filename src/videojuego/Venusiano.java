package videojuego;
//Jesús Diego Cruz Díaz
// 21/05/2018
public class Venusiano extends Extraterrestre {

    private int cabezas;

    public Venusiano() {
        super(4, 4, "Verde");
        this.cabezas = 2;
    }

    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Experimentar con terrícola");
    }
}
