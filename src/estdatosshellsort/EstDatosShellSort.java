package estdatosshellsort;

public class EstDatosShellSort {
    // Método para realizar el Shell Sort
    public static void shellSort(int[] array) {
        int n = array.length;

        // Empieza con un gap grande, y luego lo reduce
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza un ordenamiento por inserción para cada sublista con el "gap" actual
            for (int i = gap; i < n; i++) {
                int temp = array[i]; // Guarda el valor actual
                int j;

                // Desplaza los elementos ordenados dentro del gap
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap]; // Desplaza hacia adelante
                }
                array[j] = temp; // Inserta temp en su lugar adecuado
            }
        }
    }

    // Método auxiliar para imprimir el array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        int[] array = { 12, 34, 54, 2, 3 };
        System.out.println("Array original:");
        printArray(array);

        shellSort(array);

        System.out.println("Array ordenado con Shell Sort:");
        printArray(array);
    }
}
