package fs.apidef.identifyservice.java.class_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        int n, count = 0, vt = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nNhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập phần tử thứ " + i + ": ");
            array[i] = scanner.next();
        }
        System.out.println("\nHiển thị mảng: ");
        
        // Chuyển một mảng thành chuỗi (string)
        System.out.println(Arrays.toString(array));

        // Đếm số lần xuất hiện của phần tử "Java"
        for (int i = 0; i < n; i++) {
            if (array[i].equals("Java")) {
                count++;
            }
        }
        System.out.println("\nSố phần tử " + "Java" + " có trong mảng = " + count);

        // Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
        String chuoi;
        System.out.println("\nNhập vào chuỗi bất kỳ: ");
        chuoi = scanner.next();
        for (int i = 0; i < n; i++) {
            if (array[i].equals(chuoi)) {
                vt = i + 1;
            }
        }
        System.out.println("\nIndex của phần tử " + chuoi + " trong mảng là " + vt);
    }
}

