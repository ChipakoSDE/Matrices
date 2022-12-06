public class MatrizSimetrica {
    public static void main(String[] args) {
        // una matriz es simétrica cuando puedo cambiar filas por columnas y la matriz no se modifica
        boolean simetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        int i = 1, j;

        while(i < matriz.length && simetrica == true){
            j = 0;
            // para recorrer la matriz y verificar si es simétrica no es necesario recorrerla completa,
            // solo debería comprobar que una mitad sea igual a su transpuesta, para eso limito el valor de j
            // y solo recorro mientras j sea menor que i
            while (j < i  && simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        /* otra forma de hacer lo mismo con etiquetas y sin el AND
        salir:
        while(i < matriz.length){
            j = 0;

            while (j < i  && simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }
        */
        if (simetrica){
            System.out.println("La matriz es simétrica!");
        } else {
            System.out.println("La matriz NO es simétrica!");
        }

    }
}
