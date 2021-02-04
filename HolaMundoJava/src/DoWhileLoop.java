import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response= 0;

        do{
            System.out.println("Selecciona la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc= new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias, vuelva pronto");
                break;

                case 1:
                    System.out.println("Viendo películas");
                break;

                case 2:
                    System.out.println("Viendo series");
                break;

                default:
                    System.out.println("No tenemos de esas joven");
                break;
            }//Fin switch

        }while(response != 0);

        System.out.println("Se terminó el programa");

    }//Fin main

}//fin clase
