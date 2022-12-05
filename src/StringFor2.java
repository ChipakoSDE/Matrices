public class StringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        System.out.println("\n=== Iterando con un for-each ===");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
