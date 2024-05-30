public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ObjetcControlador metodo = new ObjetcControlador();
        int[] Array = {42, 17, 23, 56, 89, 3, 14};

        // Imprimir los valores del array
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + Array[i]);
        }
        metodo.ordenarBurbuja(Array);
        metodo.imprimirArray(Array);
    }
}
