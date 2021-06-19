import Exercise1.CustomException;
import Exercise1.bmi;
import Exercise2.CompareNumber;
import Exercise3.Employee;


public class Main {
    public static void main(String[] args) {
        bmi.inputData();
        CompareNumber.generateNum();
        String arr[] = Employee.inputData();
        Employee.printData(arr);
    }
    /*
    Bai 1: Viết chương trình tính chỉ số BMI, có xử lý ngoại lệ
    Bài 2: Viết chương trình tạo số ngẫu nhiên từ 10-50 và 1 số nhập từ bán phím. Sử dụng cumtom exception để xủ lý ngoại lệ
    Bài 3: Viết chương trình nhập vào 1 mảng mã nhân viên gồm n phần tử, n được nhập từ bàn phím. Định dạng mã NV: NVxxxxxxx
     */

}
