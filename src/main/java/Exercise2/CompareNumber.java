package Exercise2;


import java.util.Scanner;

public class CompareNumber {
    //Bài 2: So sánh 2 số, 1 số nhập từ bàn phím, 1 số ngẫu nhiên, đều trong khoảng từ 10-50. Sử dụng custom exception để xử lý
    public static void generateNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị nhỏ nhất của số ngẫu nhiên bạn muốn tạo");
        int min = sc.nextInt();
        System.out.println("Nhập giá trị lớn nhất của số ngẫu nhiên bạn muốn tạo");
        int max = sc.nextInt();
        System.out.println("Nhập vào 1 số ngẫu nhiên trong khoảng 10 đến 50");
        int input = sc.nextInt();
        try {
            validateData(input);
            compareNum(input, min, max);
        } catch (CustomException2 exception2) {

            System.out.println(exception2.getMessage());
        }

    }

    public static void compareNum(int input, int min, int max) {
        int random = (int) (Math.random() * (max - min)) + min;
        if (random > input) {
            System.out.printf("Số ngẫu nhiên là: %d. Số nhập vào nhỏ hơn số ngẫu nhiên", random);
        } else if (random == input) {
            System.out.printf("Số ngẫu nhiên là: %d. Số nhập vào bằng với số ngẫu nhiên", random);
        } else System.out.printf("Số ngẫu nhiên là: %d. Số nhập vào nhỏ hơn số ngẫu nhiên", random);
    }

    public static boolean validateData(int input) throws CustomException2 {
        Scanner sc = new Scanner(System.in);
        if (input < 10 || input > 50)
            throw new CustomException2("Số nhập vào không hợp lệ");

        return true;
    }

}
