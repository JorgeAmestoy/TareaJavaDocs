/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_3cod;

/**
 * Boletin6_3: Circulo
 *
 * @author Jorge Amestoy Sabucedo
 * @version 24.11.2022
 */
public class Circulo {

    /**
     * Declaro variables
     *
     * radio del circulo
     * constante PI
     */
    private double radio;
    private final static double PI = 3.14;

//Creo el constructor vacío

    public Circulo() {

    }

    /**
     * Constructor
     * @param r radio
     *
     */
    public Circulo(double r) {
        radio = r;
    }

    /**
     * Setter
     * @param r radio
     *
     */
    public void setRadio(double r) {
        radio = r;
    }

    /**
     * Getter
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Getter
     * @return PI
     */

    public double getPi() {
        return PI;
    }

    /**
     * Calculo area Circulo
     * @return area
     */
    public double calcularArea() {
        double area;
        area = PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Calculo lonxitudeCirculo
     * @return lonxitude
     */
    public double calcularLonxitude() {
        double lonxitude;
        lonxitude = 2 * PI * radio;
        return lonxitude;
    }
}