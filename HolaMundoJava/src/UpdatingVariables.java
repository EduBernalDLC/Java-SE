public class UpdatingVariables {
    public static void main(String[] args) {
        int salary= 1000;
        int bono= 200;
        int pension= 50;
        int horaExtra= 30;
        int comida= 45;

        salary+= (bono - pension);
        System.out.println(salary);

        salary+= (horaExtra * 2) - comida;
        System.out.println(salary);

        //Actualizando cadenas de texto

        String employeeName= "Edu Bernal";
        employeeName+= " DLC";
        System.out.println(employeeName);

        employeeName= "1. " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);

    }//Fin main
}//Fin clase
