public class Arrays {
    public static void main(String[] args) {
        //Los nombres siempre en plural
        String androidVersions[]= new String[18];
        String days[]= new String[7];

        String cities[][]= new String[4][2];

        int numbers[][][]= new int[2][2][2];
        int numbers4[][][][]= new int[1][0][0][1];

        //-------------------------Segunda Clase-------------------------------------

        androidVersions[0]= "Apple Pie";
        androidVersions[1]= "Bannana Bread";
        androidVersions[2]= "Cupcake";
        androidVersions[3]= "Donut";
        androidVersions[4]= "Eclair";
        androidVersions[5]= "Froyo";
        androidVersions[6]= "Gingerbread";
        androidVersions[7]= "Honeycomb";
        androidVersions[8]= "Ice Cream Sandwich";
        androidVersions[9]= "Jelly Bean";
        androidVersions[10]= "KitKat";
        androidVersions[11]= "Lollipop";
        androidVersions[12]= "Marshmallow";
        androidVersions[13]= "Nougat";
        androidVersions[14]= "Oreo";
        androidVersions[15]= "Pie";
        androidVersions[16]= "Ten";
        androidVersions[17]= "Eleven";

        for (int i= 0; i<18; i++){
            System.out.println(androidVersions[i]);
        }//Fin for versiones de Android

        //Ciudades
        System.out.println("");
        System.out.println("");

        cities[0][0]= "México";
        cities[0][1]= "CDMX";
        cities[1][0]= "México";
        cities[1][1]= "Guadalajara";
        cities[2][0]= "Colombia";
        cities[2][1]= "Bogotá";
        cities[3][0]= "Colombia";
        cities[3][1]= "Medellín";

        for(int i= 0; i<4; i++){
            for(int j= 0; j<2; j++){

                System.out.println(cities[i][j]);
            }//Fin j
        }//Fin i

        //Changuito
        System.out.println("");
        System.out.println("");

        String animals[][][][]= new String[2][3][2][2];

        animals[1][0][0][1]= "ChanguiMonkey";

        System.out.println(animals[1][0][0][1]);

    }//Fin main

}//Fin clase
