/*Biến Java
Biến là các thùng chứa để lưu trữ các giá trị dữ liệu.

Trong Java, có nhiều loại biến khác nhau, ví dụ:

String- lưu trữ văn bản, chẳng hạn như "Xin chào". Giá trị chuỗi được bao quanh bởi dấu ngoặc kép
int- lưu trữ số nguyên (số nguyên), không có số thập phân, chẳng hạn như 123 hoặc -123
float- lưu trữ số dấu phẩy động, với số thập phân, chẳng hạn như 19,99 hoặc -19,99
char- lưu trữ các ký tự đơn, chẳng hạn như 'a' hoặc 'B'. Giá trị char được bao quanh bởi dấu nháy đơn
boolean- lưu trữ các giá trị với hai trạng thái: đúng hoặc sai

Cú pháp; 
type variableName = value;

Nếu bạn không muốn người khác (hoặc chính bạn) ghi đè lên các giá trị hiện có, hãy sử dụng từ finalkhóa (từ khóa này sẽ khai báo biến là "cuối cùng" hoặc "hằng số", có nghĩa là không thể thay đổi và chỉ đọc):
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
public class Main {
  public static void main(String[] args) {
    final int myNum = 15;
    myNum = 20; // will generate an error
    System.out.println(myNum);
  }
}
*/

public class Day2 {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        // int myNum = 15;
        // System.out.println(myNum);
        int myNum;
        myNum = 16;
        System.out.println(myNum);
        myNum = 20;  // myNum is now 20
        System.out.println(myNum);
        
        float myFloatNum = 5.99f;
        char myLetter = 'D';  
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);          
    }
}                    
