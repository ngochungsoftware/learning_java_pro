/*
Truyền kiểu Java
Truyền kiểu là khi bạn gán một giá trị của một kiểu dữ liệu nguyên thủy cho một kiểu khác.

Trong Java, có hai kiểu ép kiểu:

Truyền mở rộng (tự động) - chuyển đổi loại nhỏ hơn thành kích thước loại lớn hơn
byte-> short-> char-> int-> long-> float->double

Thu hẹp Đúc (thủ công) - chuyển đổi loại lớn hơn thành loại có kích thước nhỏ hơn
double-> float-> long-> int-> -> char-> short->byte
Đúc mở rộng
Quá trình đúc mở rộng được thực hiện tự động khi chuyển loại kích thước nhỏ hơn sang loại kích thước lớn hơn:
Đúc thu hẹp
Việc truyền thu hẹp phải được thực hiện thủ công bằng cách đặt loại trong ngoặc đơn trước giá trị:



*/
public class Day4 {
    public static void main(String[] args) {
        int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    double my_ouble = 9.78d;
    int my_int = (int) my_double; // Manual casting: double to int

    System.out.println(my_double);   // Outputs 9.78
    System.out.println(my_int);      // Outputs 9
    }
}