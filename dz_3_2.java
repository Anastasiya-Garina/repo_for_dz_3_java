import java.util.Scanner;
public class dz_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int size = sc.nextInt();
        int[] Array1 = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Введите элемент массива: ");
            Array1[i] = sc.nextInt();
        }
        System.out.print("Число к удалению: ");
        double nom = sc.nextDouble();
        if (nom != (int) nom) {
            System.out.print("Ошибка, массив и число к удалению должны быть целыми");
            return;
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
        int jj = 0;
        int[] Array2 = new int[size];
        for (int i = 0; i < size; i++){
            if (Array1[i] != nom) {
                Array2[jj] = Array1[i];
                jj++;
            }
        }
        System.out.println();
        System.out.print("Массив после обработки: ");
        for (int i = 0; i < Array2.length; i++) {
            if (Array2[i] != 0) {
                System.out.print(Array2[i] + " ");
            }
        }
        sc.close();
    }
}
