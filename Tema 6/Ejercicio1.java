/*
 * Tema 6
 * 
 * Ejercicio 1
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 */


public class Ejercicio1 {
  public static void main (String[] args) {
    System.out.println("�C�al es el resultado de la tirada?");
    int total;
    int suma = 0;
    for (int i = 1 ; i <= 3 ; i++) {
      total =((int)(Math.random() * 6 + 1));
      System.out.println(total + " ");
      suma += total;
    }
      System.out.print("El total de los resultados obtenidos es " + suma);
  }
}

