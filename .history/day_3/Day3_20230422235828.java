/* Các kiểu số nguyên:
Kiểu dữ byteliệu có thể lưu trữ các số nguyên từ -128 đến 127. Điều này có thể được sử dụng thay cho inthoặc các kiểu số nguyên khác để tiết kiệm bộ nhớ khi bạn chắc chắn rằng giá trị sẽ nằm trong khoảng -128 và 127:
Ngắn
Kiểu shortdữ liệu có thể lưu trữ các số nguyên từ -32768 đến 32767:
Dài
Kiểu longdữ liệu có thể lưu trữ các số nguyên từ -9223372036854775808 đến 9223372036854775807. Kiểu dữ liệu này được sử dụng khi int không đủ lớn để lưu trữ giá trị. Lưu ý rằng bạn nên kết thúc giá trị bằng chữ "L":







*/




public class Day3 {
    public static void main(String[] args) {
        byte myNum = 100;
        System.out.println(myNum);
        short myNum2 = 5000;
        System.out.println(myNum2);
        long my_number = 10000000000L; // kiểu long phải có chữ "L " ở cuối bắt buộc
        System.out.println(my_number);
    }

}