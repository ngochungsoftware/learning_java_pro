/*
 Giá trị Boolean
Một kiểu boolean được khai báo với booleantừ khóa và chỉ có thể nhận các giá trị truehoặc false:






 */

public class Day7 {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
          System.out.println("Old enough to vote!");
        } else {
          System.out.println("Not old enough to vote.");
        }
        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
}
int time = 9;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
        
    }

}