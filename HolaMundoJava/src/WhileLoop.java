public class WhileLoop {

    static boolean isTurnOnLight= false;

    public static void main(String[] args) {

        turnOnOffLight();

        int i= 1;

        while (isTurnOnLight && (i <= 10)){
            printSOS();

            i++;
        }//Fin while

    }//Fin main

    //-----------------------Funciones------------------------
    public static void printSOS(){
        System.out.println(" . . . _ _ _ . . . ");
    }//Fin printSOS

    public static boolean turnOnOffLight(){
        isTurnOnLight= (isTurnOnLight)?false:true; //operador
        return isTurnOnLight;
    }//Fin turnOnOffLight

}//Fin clase
