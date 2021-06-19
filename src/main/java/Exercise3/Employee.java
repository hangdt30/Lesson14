package Exercise3;

import Exercise1.CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
    //Bài 3:Nhập vào 1 mảng gồm n phần tử, là các mã nhân viên có định dạng NVxxxxxxx
    public static final String regex = "NV\\d{7}";

    public static String[] inputData() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            n=inputSize();
        } catch (CustomException3 exception3) {
            System.out.println(exception3.getMessage());
        }
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mã nhân viên thứ: " + i);
            arr[i] = sc.nextLine();
            while (!arr[i].matches(regex)) {
                System.out.println("Định dạng mã nhân viên không đúng. Xin mời nhập lại!");
                arr[i] = sc.nextLine();
            }

        }
        return arr;
    }

    public static void printData(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhân viên thứ: " + i + " có mã nhân viên là: " + arr[i]);
        }
    }

    public static int inputSize() throws CustomException3 {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Nhập số nhân viên: ");
            n = sc.nextInt();
            sc.nextLine();
            if (n <= 0) throw new CustomException3("Cần nhập số lớn hơn 0");
        } catch (InputMismatchException exception) {
            throw new CustomException3("Cần nhập số");
        }
        return n;
    }
}
