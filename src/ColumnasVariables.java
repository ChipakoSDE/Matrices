public class ColumnasVariables {
    public static void main(String[] args) {
        int[][] numeros = new int[3][];
        // definimos diferentes tamaños en cada fila
        numeros[0] = new int[2];
        numeros[1] = new int[3];
        numeros[2] = new int[4];

        System.out.println("Cantidad de filas: " + numeros.length);
        System.out.println("Cantidad de columnas en fila 1: " + numeros[0].length);
        System.out.println("Cantidad de columnas en fila 2: " + numeros[1].length);
        System.out.println("Cantidad de columnas en fila 3: " + numeros[2].length);


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = i * j;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
