import java.util.Scanner;
public class Divisibile {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int a = obj.nextInt();
if (a%7==0) {
System.out.println(a+ " is divisible by 7");
} else {
System.out.println(a+ " is not divisible by 7");
}
}
}
