package org.example;

/**
 * Clase que emula un punto
 */
public class Punto {

    int x;
    int y;
    /*
    public Punto(){
        x = 0;
        y = 0;
    }*/

    /**
     * Contructior vacio
     */
    public Punto(){}

    /**
     * Contructor con todos los parametros
     * @param x posicion en el eje "x" o tambien en el eje de las ordenadas
     * @param y posicion en el eje de las "y" o de las absisas
     */
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * El metodo imprime las coordenadas del punto
     */
    public void imprimePunto(){
        System.out.println("x = "+x+", y = "+y);
    }
}
