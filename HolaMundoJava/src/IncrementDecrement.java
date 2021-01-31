public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;

        lives -= 1;
        System.out.println("Vidas restantes: " + lives);

        lives--;
        System.out.println("Vidas restantes: " + lives);

        lives++;
        System.out.println("Vidas restantes: " + lives);

        //----------------------------Prefija-----------------------------------------------------
        System.out.println("");

        int gift= 100 + ++lives;//prefijo

        System.out.println(gift);

    }//Fin main
}//Fin clase
