package org.example;

/**
 * Clase que imita a un pokemon, algunos atributos y metodos no sol colocados del todo preciso ya que solo sirven de ejemplo
 * no esta pensaod para futuras actualizaciones
 */
public class Pokemon {

    int ataque;
    int defensa;
    int defensaEsp;
    int ataqueEsp;
    float velocidad;

    /**
     * Constructor vacio
     */
    public Pokemon() {
    }

    /**
     * Constructor con todos los atributos directos
     * @param ataque -> numero entero, posible implementacion en el futuro
     * @param defensa -> numero entero, posible implementacion en el futuro
     * @param defensaEsp -> numero entero, es diferente de defensa
     * @param ataqueEsp -> numero entero, posible uso futuro
     * @param velocidad -> numero decimal, indica la valocidad del individuo
     */

    public Pokemon(int ataque, int defensa, int defensaEsp, int ataqueEsp, float velocidad) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.defensaEsp = defensaEsp;
        this.ataqueEsp = ataqueEsp;
        this.velocidad = velocidad;
    }

    /**
     * Imprime un  mensaje de ataque
     */
    public void atacar() {
        System.out.println("Te voy a atacar");
    }

    /**
     * El pokemon puede usar un objeto -> obstracto ya que no hay una implementacion actual
     * @param objeto -> Nombre del objeto
     */
    public void usarObjeto(String objeto) {
        System.out.println("He usado el objeto " + objeto);
    }

    /**
     * Imprime un mensaje de huida
     */

    public void retirarse() {
        System.out.println("Se retira");
    }

    /**
     * Imprime un mensaje de accion
     */

    public void curarse() {
        System.out.println("Me voy a curar");
    }

    /**
     * Imprime una advertencia de movimiento
     */

    public void defender() {
        System.out.println("Me voy a defender");
    }
}
