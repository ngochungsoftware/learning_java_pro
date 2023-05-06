/*
Toan java
Math.max( x,y )
Phương pháp này có thể được sử dụng để tìm giá trị cao nhất của x và y :Math.max(x,y)
Số ngẫu nhiên
Math.random()trả về một số ngẫu nhiên trong khoảng từ 0,0 (bao gồm) đến 1,0 (không bao gồm):
Ví dụ: để có thêm quyền kiểm soát đối với số ngẫu nhiên, nếu bạn chỉ muốn một số ngẫu nhiên trong khoảng từ 0 đến 100, bạn có thể sử dụng công thức sau:


 */

public class Day6 {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7)); // trả về trị tuyệt đối dương
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);





    }
}