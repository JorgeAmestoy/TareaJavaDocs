package boletin6_3cod;

/**
 * Aplicacion para calcular area y longitud de un circulo
 *
 * @version 25.11.2022
 * @Author Jorge Amestoy Sabucedo
 */
public class Boletin6_3COD {

    public static void main(String[] args) {

        String areaCirculo = "El area es igual a ";
        String longitudCirculo = "La longitud es igual a ";

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(5);
        circulo1.calcularArea();
        double resultado = circulo1.calcularArea();
        System.out.println(areaCirculo + resultado);
        circulo1.calcularLonxitude();
        double resultado2 = circulo1.calcularLonxitude();
        System.out.println(longitudCirculo + resultado2);
    }

}
