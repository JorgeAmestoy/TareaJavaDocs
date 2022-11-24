/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_3cod;

public class Boletin6_3COD {

    public static void main(String[] args) {

        //Instancio objeto Clase Circulo
        Circulo circulo1 = new Circulo();
        //Doy un valor al radio con Setter
        circulo1.setRadio(5);
        //Llamo al método que calcula el area
        circulo1.calcularArea();
        //Creo variable para guardar el resultado del area
        double resultado = circulo1.calcularArea();
        //Visualiazo el resultado
        System.out.println("El area es igual a " + resultado);
        //Llamo al método que calcula la lonxitude
        circulo1.calcularLonxitude();
        //Creo variable para guardar el resultado de la longitud
        double resultado2 = circulo1.calcularLonxitude();
        //Visualizo el resultado de la longitud
        System.out.println("La longitud es igual a " + resultado2);
    }

}
