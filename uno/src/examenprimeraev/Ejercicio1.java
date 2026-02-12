package examenprimeraev;

public class Ejercicio1 {

/*Dos números amigos son dos números enteros positivos a y b tales que a es la suma de los divisores de b, y 
b es la suma de los divisores de a. Dados dos números A y B calcular si son números amigos. Un ejemplo es el 
par de números naturales (220, 284), ya que:
los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284;
los divisores propios de 284 son 1, 2, 4, 71 y 142, que suman 220.
Listar por pantalla todas las parejas de números amigos entre 1 y 10.000.
 */

    public static int sumaDivisores(int n) { // Método para sumar divisores. Se pide un número entero.
        int suma = 0; // Inicializa suma
        for (int i = 1; i < n; i++) { // Itera de 1 a n-1
            if (n % i == 0) // Calcula si es divisor con el módulo.
                suma += i; // Suma el divisor
        }
        return suma; // Devuelve la suma total

    }
    public static boolean sonAmigos(int n1, int n2) { // Método para encontrar si 2 números son amigos. Se piden dos números enteros.
        if (n1 == sumaDivisores(n2) && n2 == sumaDivisores(n1)) { // Si n1 es sumaDiv(n2) Y n2 es sumaDiv(n1)
            return true; // Son amigos
        } else {
            return false; // No son amigos
        }
    }
    public static void main(String[] args) {
        int n1 = 1;// pongo el n1 para el primer numero
        int n2 = 10000; // pongo n2 para el ultimo numero 
        while (n1 == 5000) { //cuando n1 llega a 5000 estan todas las combinaciones
            n1++;// aumento en 1 n1
            n2--; // reduzco en 1 n2
            if (sonAmigos(n1, n2)==true) { //si son amigos muestra true
                System.out.println(n1 + n2);
                System.out.println("true");
            }
        }
    }
}
