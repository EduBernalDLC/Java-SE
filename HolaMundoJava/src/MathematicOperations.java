public class MathematicOperations {
    public static void main(String[] args) {
        double x= 2.1;
        double y= 3;

        //Redondeo hacia arriba
        System.out.println(Math.ceil(x));

        //Redondeo hacia abajo
        System.out.println(Math.floor(x));

        //número elevado a una potencia
        System.out.println(Math.pow(x, y));

        //Dato mayor
        System.out.println(Math.max(x, y));

        //Raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Área de un círculo
        //pi * r^2
        System.out.println("Área círculo: " + Math.PI * Math.pow(y, 2));

        //Área de una esfera
        //4 * pi * r^2
        System.out.println("Área esfera: " + (4 * Math.PI * Math.pow(y, 2)));

        //Volúmen de una esfera
        //(4/3) * pi * r^3
        System.out.println("Volúmen de una esfera: " + ((4/3) * Math.PI * Math.pow(y, 3)));

    }//Fin main
}//Fin clase
