/*
 Short hand if else trong java
 Cau truc: condition ? value_if_true : value_if_false
Nó được sử dụng khi bạn muốn lựa chọn giữa hai giá trị dựa trên một điều kiện. Nếu điều kiện đúng, thì giá trị đầu tiên được chọn, nếu không, giá trị thứ hai được chọn.
Vòng lặp trong java 
vòng lặp
Các vòng lặp có thể thực thi một khối mã miễn là đạt được một điều kiện cụ thể.

Vòng lặp tiện dụng vì chúng tiết kiệm thời gian, giảm lỗi và giúp mã dễ đọc hơn.
Vòng lặp Java While
Vòng whilelặp lặp qua một khối mã với điều kiện là true:
while (condition) {
  // code block to be executed
}
Trong ví dụ bên dưới, mã trong vòng lặp sẽ chạy đi chạy lại miễn là biến (i) nhỏ hơn 5:


 */
public class Day8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int max = (a > b) ? a : b;

        System.out.println("Giá trị lớn nhất là: " + max);

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)

        int i = 0;
        while (i < 5) {
         System.out.println(i);
         i++;
        }

        // Vòng lặp Do/While
        // Vòng do/whilelặp là một biến thể của whilevòng lặp. Vòng lặp này sẽ thực thi khối mã một lần, trước khi kiểm tra xem điều kiện có đúng không, sau đó nó sẽ lặp lại vòng lặp miễn là điều kiện còn đúng.
        int h = 0;
        do {
         System.out.println(h);
         i++;
        }
        while (h < 5);
        
            }

        

}