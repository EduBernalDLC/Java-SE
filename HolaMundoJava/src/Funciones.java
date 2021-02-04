public class Funciones {
    public static void main(String[] args) {
        double y= 3;
        double area= circleArea(y);

        System.out.println(area);
        System.out.println(sphereArea(y));
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos a dolares: " + converToDolar(200, "MXN"));
        
    }//Fin main

    //--------------------Funciones-----------------------------------------------------------
    public static double circleArea(double r){//Static porque comparte el main
        return Math.PI * Math.pow(r, 2);
    }//Fin función circleÁrea

    public static double sphereArea(double r){
        return (4 * Math.PI * Math.pow(r, 2));
    }//Fin función SphereArea

    public static double sphereVolumen(double r){
        return ((4/3) * Math.PI * Math.pow(r, 3));
    }//Fin función SphereVolumen

    /**
     * Descripción breve de lo que se trata la función: Esta función que especificando su moneda, convierte una cantidad a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda, solo acepta pesos mexicanos o colombianos
     *
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar(double quantity, String currency){
        System.out.println("");

        switch (currency){
            case "MXN":
                quantity*= 0.052;
            break;

            case "COP":
                quantity*= 0.00031;
            break;

            default:
                System.out.println("Moneda inválida ya me dio amsiedad");
            break;
        }//Fin switch

        return quantity;
    }//Fin función convertToDolar

}//Fin clase
