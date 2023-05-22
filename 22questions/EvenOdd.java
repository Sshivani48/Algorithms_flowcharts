import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int a = obj.nextInt();
if (a%2==0) {
System.out.println(a+ " is a Even number");
} else {
System.out.println(a+ " is a Odd number");
}
}
}
