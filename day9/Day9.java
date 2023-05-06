/* 
 For-Each Loop
 Ngoài ra còn có một vòng lặp " for-each ", được sử dụng riêng để lặp qua các phần tử trong một mảng :
 Fomat:
 for (type variableName : arrayName) {
  // code block to be executed
}
 */


public class Day9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }
        for (int a = 0; a <= 10; a = a + 2) {
            System.out.println(a);
          }
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
          }

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
        
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        }

        // Java Break and Continue
        // Câu lệnh này break cũng có thể được sử dụng để nhảy ra khỏi vòng lặp .
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          }
        //   Tiếp tục Java
        //   Câu continuelệnh ngắt một lần lặp (trong vòng lặp), nếu một điều kiện xác định xảy ra và tiếp tục với lần lặp tiếp theo trong vòng lặp.
        //   
        //   Ví dụ này bỏ qua giá trị của 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          } 
          




  
    }
    
    
    

}