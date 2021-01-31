public class Casting {
    public static void main(String[] args) {
        //En un año ubicamos 30 perros
        //Cuántos fueron ubicados al mes?

        double monthlyDogs= 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimatedMonthlyDogs= (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        System.out.println("");
        int a= 30;
        int b= 12;

        System.out.println((double) a/b);

    }//Fin main
}//Fin clase
