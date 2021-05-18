package fs.apidef.identifyservice.java.class_5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        // sắp xếp theo thứ tự giảm dần
        int vtmax=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                    vtmax=j-1;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
        System.out.println("\nIndex của phần tử nhỏ nhất trong mảng là " + vtmax);

        //sắp xếp theo thứ tự tăng dần
        int vtmax1=0, vtmax2=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] > array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                    vtmax1=j;
                    vtmax2=j+1;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPhần tử lớn nhất trong mảng là " + array[n - 1]);
        System.out.println("\nIndex của phần tử lớn nhất trong mảng là " + vtmax1);
        System.out.println("\nPhần tử lớn thứ 2 trong mảng là " + array[n -2]);
        System.out.println("\nIndex của phần tử lớn thứ 2 trong mảng là " + vtmax2);
    }


}
