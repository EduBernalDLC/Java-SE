public class DataTypes {
    public static void main(String[] args) {

        int n= 1234567890;
        long nLong= 12345678901L;

        double nDouble= 123.4567890;
        float nFloat= 123.0987654321F;

        //----------------------------Segunda clase---------------------------------------------
        var salary= 10000;
        var totalSalary= 0;

        //La pensión es el 3% del salario
        var pension= (salary * 0.03);

        System.out.println("El salario es: " + salary);
        System.out.println("La pensión es: " + pension);

        totalSalary= (int) (salary - pension);
        System.out.println("Salario total: " + totalSalary);

        //------------Ahora con texto------------------------------
        System.out.println("");

        var employeeName= "Edu";
        System.out.println("Empleado: " + employeeName + " con salario $" + totalSalary);

    }//Fin main
}//Fin clase
