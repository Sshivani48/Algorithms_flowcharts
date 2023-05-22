import java.util.Scanner;
public class Multiple {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int a = obj.nextInt();
if (a%5==0) {
System.out.println("Hello");
} else {
System.out.println("Bye");
}
}
}
