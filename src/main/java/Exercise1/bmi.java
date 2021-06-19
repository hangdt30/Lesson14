package Exercise1;

import java.util.Scanner;

public class bmi {


    //Viết chương trình tính chỉ số bmi, sử dụng ngoại lệ
    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        double height, weight;
        System.out.println("Nhập chiều cao của bạn");
        height = sc.nextDouble();
        System.out.println("Nhập cân nặng của bạn");
        weight = sc.nextDouble();
        try {
            validateData(height, weight);
            bMI(height, weight);
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static double bMI(double height, double weight) {
        double bmi;
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("BẠn hơi gầy: " + bmi);
        } else {
            if (bmi >= 18.5 & bmi <= 24.9) {
                System.out.println("Bạn cân đối: " + bmi);
            } else System.out.println("Bạn thừa cân: " + bmi);

        }

        return bmi;
    }

    public static boolean validateData(double height, double weight) throws CustomException {
        if (height == 0 || weight == 0) {
            throw new ArithmeticException("Chiều cao và cân nặng phải khác 0");
        }
        if (height < 0 || weight < 0) {
            throw new CustomException("Chiều cao và cân nặng phải lớn hơn 0");
        }
        return true;
    }


}
