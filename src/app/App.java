package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arrInt = new int[10];
        arrInt[0] = 3;
        arrInt[1] = 2;
        arrInt[2] = 7;
        arrInt[3] = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số muốn thêm vào mảng: ");
        int newInt = scanner.nextInt();

        System.out.print("\nNhập vị trí muốn thêm: ");
        int newIndex = scanner.nextInt();

        // 
        int old;

        System.out.println("\nMảng ban đầu:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d ", arrInt[i]);
        }

        System.out.println("\n");
        for (int i = newIndex; i < arrInt.length; i++){
            old       = arrInt[i];
            arrInt[i] = newInt;
            newInt    = old;
        }

        System.out.println("\nSau khi được thêm phần tử:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d ", arrInt[i]);
        }

    }
}
