public class Switch {
    public static void main(String[] args) {
        String colorModeSelected= "Dar";

        switch(colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
            break;

            case "Night":
                System.out.println("Seleccionaste Night Mode");
            break;

            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
            break;

            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
            break;

            default:
                System.out.println("Ningún modo seleccionado, me da amsiedad");
            break;
        }//Fin switch

    }//Fin main
}//Fin clase
