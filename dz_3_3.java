import java.util.Scanner;

public class dz_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int size = sc.nextInt();
        double[] Array1 = new double[size];
        for (int i = 0; i < size; i++){
            System.out.print("Введите элемент массива: ");
            Array1[i] = sc.nextDouble();
        }
        System.out.println("");
        System.out.print("Исходный массив: ");
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
        System.out.println();
        double[] Array2 = new double[size];
        Array2[0] = Array1[0];
        double nn = Array2[0];
        int k = 1;
        for (int i = 1; i < size; i++) {
            if (nn < Array1[i]) {
                Array2[k] = Array1[i];
                nn = Array1[i];
                k++;
            }
        }
        System.out.print("Массив после обработки: ");
        for (int i = 0; i < Array2.length; i++) {
            if (Array2[i] != 0) {
                System.out.print(Array2[i] + " ");
            }
        }
        sc.close();
    }
}