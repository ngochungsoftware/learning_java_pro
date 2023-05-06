/*
Mảng Java
Mảng được sử dụng để lưu trữ nhiều giá trị trong một biến duy nhất, thay vì khai báo các biến riêng biệt cho từng giá trị.

Để khai báo một mảng, hãy xác định kiểu biến bằng dấu ngoặc vuông :
String[] cars;



 */


public class Mang {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        System.out.println(myNum[1]);
        // Thay đổi một phần tử mảng
        // Để thay đổi giá trị của một phần tử cụ thể, hãy tham khảo số chỉ mục:
        // cars[0] = "Opel";
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo
        // Độ dài mảng
        // Để biết một mảng có bao nhiêu phần tử, hãy sử dụng 'length' thuộc tính:
        String[] test = {"Opel", "BMW", "Ford", "Mazda"};
        System.out.println(test.length);
        // Outputs 4
        // Lặp qua một mảng
        // Bạn có thể lặp qua các phần tử mảng bằng for vòng lặp và sử dụng length thuộc tính để chỉ định số lần vòng lặp sẽ chạy.
        // Ví dụ sau xuất ra tất cả các phần tử trong mảng ô tô :
        String[] test2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < test2.length; i++) {
        System.out.println(test2[i]);
        }


        // Lặp qua một mảng với For-Each
        // Ngoài ra còn có một vòng lặp " for-each ", được sử dụng riêng để lặp qua các phần tử trong mảng:

        String[] test3 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : test3) {
          System.out.println(i);
        }



    }
}