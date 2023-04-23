/* Toan tu trong java
Mặc dù +toán tử thường được sử dụng để cộng hai giá trị với nhau, như trong ví dụ trên, nhưng nó cũng có thể được sử dụng để cộng một biến và một giá trị, hoặc một biến với một biến khác:
==> Chuỗi trong java;
Chuỗi được sử dụng để lưu trữ văn bản.
Một String biến chứa một tập hợp các ký tự được bao quanh bởi dấu ngoặc kép:
Chiều dài chuỗi
Chuỗi trong Java thực sự là một đối tượng, chứa các phương thức có thể thực hiện các thao tác nhất định trên chuỗi. Ví dụ: độ dài của một chuỗi có thể được tìm thấy bằng phương length()thức:

Các phương thức chuỗi khác
Có rất nhiều phương thức chuỗi có sẵn, ví dụ toUpperCase()and toLowerCase():
 
Tìm một ký tự trong một chuỗi
Phương thức này indexOf()trả về chỉ mục (vị trí) của lần xuất hiện đầu tiên của một văn bản đã chỉ định trong một chuỗi (bao gồm cả khoảng trắng):

nối chuỗi
Toán +tử có thể được sử dụng giữa các chuỗi để kết hợp chúng. Điều này được gọi là nối :

 */



public class Day5 {
    public static void main(String[] args) {
        int x = 100 + 50;
        System.out.println(x);
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum3);
        String greeting = "Hello";
        System.out.println("The length ò the txt string : " + greeting.length());
        String txt = "Hello World"; 
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        String firstName ="John";
        String lastName ="Doe";
        System.out.println(firstName + " " + lastName); 
        // Bạn cũng có thể sử dụng concat()phương thức để nối hai chuỗi: " de tao khoang trang"
        String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));

    }


}