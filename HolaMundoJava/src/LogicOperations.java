public class LogicOperations {
    public static void main(String[] args) {
        int a= 8;
        int b= 5;

        System.out.println("a es igual a b? " + (a == b));
        System.out.println("a es diferente de b? " + (a != b));

        //Operadores relacionales
        System.out.println("");
        System.out.println("a es mayor que b? " + (a > b));
        System.out.println("a es menor que b? " + (a < b));
        System.out.println("a es mayor o igual que b? " + (a >= b));
        System.out.println("a es menor o igual que b? " + (a <= b));

        //Lo hacemos en if
        System.out.println("");
        if(a == b){
            System.out.println("a es igual a b");

        }else if((a != b) && (a > b)){
            System.out.println("a es diferente de b");

        }else if(a > b){
            System.out.println("a es mayor que b");

        }else if(a < b){
            System.out.println("a es menor que b");

        }else if(a >= b){
            System.out.println("a es mayor o igual que b");

        }else if(a <= b){
            System.out.println("a es menor o igual que b");

        }

    }//Fin main
}//Fin clase
