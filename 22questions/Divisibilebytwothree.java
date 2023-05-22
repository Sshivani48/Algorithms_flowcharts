import java.util.Scanner;
public class Divisibilebytwothree {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int a = obj.nextInt();
if (a%2==0&&a%3==0) {
System.out.println(a+ " is divisible by both 2&3");
} else {
System.out.println(a+ " is not divisible");
}
}
}
