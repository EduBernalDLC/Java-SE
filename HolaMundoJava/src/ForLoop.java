public class ForLoop {

    static boolean isTurnOnLight= false;

    public static void main(String[] args) {

        turnOnOffLight();

        for(int i=0; i<10; i++){
            printSOS();
        }//Fin for

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
