package org.example;

/**
 * @author hGarciaJoel
 */

/**
 * Aqui se probaran las clases Punto y Pokemon
 */

public class Main {

    /**
     * Vamos a crear una clase llamada : Punto como propiedades esta clase tendrá 2:
     * todas de tipo entero (int) llamas x,y; el constructor sera el de defautl y
     * uno con todos los parámetros ,y finalmente solo tendrá un metodo el cual imprime su posición como "Punto"
     */

    public static void EJERCICIO1(){
        int a = 5;
        System.out.println(a);

        Punto punto = new Punto(); //Construcutor se llama igual que la clase
        System.out.println(punto); //Imprime la referencia del objeto
        punto.imprimePunto(); //Imprime los atributos del objeto
        punto.x = 3;
        punto.y = 6;
        punto.imprimePunto();
        punto.x = 3;
        punto.y = 6;
        punto.imprimePunto();

        Punto punto2 = new Punto(4,5);
        punto2.imprimePunto();
    }

    /**
     * Vamos a jugar mas con las clases creando otra, pero esta vez vamos a re-crear un pokemon e instanciar un Snorlax:
     */
    public static void EJERCICIO2(){
        Pokemon snorlax = new Pokemon();
        snorlax.atacar();
    }

    public static void main(String[] args) {
        EJERCICIO1();
        EJERCICIO2();
    }
}