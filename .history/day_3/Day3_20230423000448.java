/* Các kiểu số nguyên:
Kiểu dữ byteliệu có thể lưu trữ các số nguyên từ -128 đến 127. Điều này có thể được sử dụng thay cho inthoặc các kiểu số nguyên khác để tiết kiệm bộ nhớ khi bạn chắc chắn rằng giá trị sẽ nằm trong khoảng -128 và 127:
Ngắn
Kiểu shortdữ liệu có thể lưu trữ các số nguyên từ -32768 đến 32767:
Dài
Kiểu longdữ liệu có thể lưu trữ các số nguyên từ -9223372036854775808 đến 9223372036854775807. Kiểu dữ liệu này được sử dụng khi int không đủ lớn để lưu trữ giá trị. Lưu ý rằng bạn nên kết thúc giá trị bằng chữ "L":
Các loại dấu phẩy động
Bạn nên sử dụng loại dấu phẩy động bất cứ khi nào bạn cần một số có phần thập phân, chẳng hạn như 9,99 hoặc 3,14515.

Các kiểu dữ liệu floatvà doublecó thể lưu trữ các số phân số. Lưu ý rằng bạn nên kết thúc giá trị bằng "f" cho số float và "d" cho số gấp đôi:

số khoa học
Số dấu phẩy động cũng có thể là một số khoa học có chữ "e" để biểu thị lũy thừa của 10

Các kiểu Boolean
Rất thường xuyên trong lập trình, bạn sẽ cần một kiểu dữ liệu chỉ có thể có một trong hai giá trị, chẳng hạn như:

CÓ KHÔNG
BẬT / TẮT
ĐÚNG SAI
Đối với điều này, Java có một booleankiểu dữ liệu chỉ có thể nhận các giá trị truehoặc false:







*/




public class Day3 {
    public static void main(String[] args) {
        byte myNum = 100;
        System.out.println(myNum);
        short myNum2 = 5000;
        System.out.println(myNum2);
        long my_number = 10000000000L; // kiểu long phải có chữ "L " ở cuối bắt buộc
        System.out.println(my_number);
        float myNum3 = 5.75f;
        System.out.println(myNum3);
        double myNum4 = 19.99d;
        System.out.println(myNum4);
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
    }

}