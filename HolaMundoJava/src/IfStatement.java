public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled= false;
        int fileSended= 3;

        if(isBluetoothEnabled == true){
            int i= 0;
            i++;

            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Por favor enciende tu bluetooth");
            fileSended--;
        }//fin if else

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }//Fin main
}//Fin clase
