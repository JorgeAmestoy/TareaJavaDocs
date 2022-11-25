package boletin6_3cod;

/**
 * Boletin6_3: Circulo
 *
 * @author Jorge Amestoy Sabucedo
 * @version 24.11.2022
 */
public class Circulo {
    /**
     * Es una variable que identifica el radio del circulo
     */
    private double radio;
    /**
     * Es una variable con valor fijo
     */
    private final static double PI = 3.14;

    /**
     * Constructor por defecto
     */
    public Circulo() {

    }

    /**
     * Constructor parametrizado
     *
     * @param r es el radio del circulo
     */
    public Circulo(double r) {

        radio = r;
    }

    /**
     * Setter
     * Da valor al radio del circulo
     *
     * @param r es el radio del circulo
     */
    public void setRadio(double r) {

        radio = r;
    }

    /**
     * Getter
     * Retorna el valor del radio del circulo
     *
     * @return radio del circulo
     */
    public double getRadio() {

        return radio;
    }

    /**
     * Getter
     * Retonar valor de PI
     *
     * @return PI del circulo
     */

    public double getPi() {
        return PI;
    }

    /**
     * Metodo que calcula el area del circulo
     *
     * @return area del circulo
     */
    public double calcularArea() {
        double area;
        area = PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Metodo que calcula la longitud del circulo
     *
     * @return longitud del circulo
     */
    public double calcularLonxitude() {
        double lonxitude;
        lonxitude = 2 * PI * radio;
        return lonxitude;
    }
}