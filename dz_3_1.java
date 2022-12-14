import java.util.Scanner;
public class dz_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = sc.nextInt();
        int[] Array1 = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Введите элемент массива: ");
            Array1[i] = sc.nextInt();
        }
        System.out.print("Исходный массив: ");
        for(int k = 0; k < Array1.length; k++) {
            System.out.print(Array1[k] + " ");
        }
        float[] Array2 = new float[size];
        float sum = 0;
        for (int j = 0; j < size; j++){
            sum += Array1[j];
            Array2[j] = sum/(j+1);
        }
        System.out.println();
        System.out.print("Массив после обработки: ");
        for(int l = 0; l < Array2.length; l++) {
            System.out.print(Array2[l] + " ");
        }
    }
}