import java.util.Scanner;
public class Largest {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter three numbers");
int a = obj.nextInt();
int b = obj.nextInt();
int c = obj.nextInt();
if (a>b&&a>c) {
System.out.println(a+ " is largest");
} else if(b>c&&b>c) {
System.out.println(b+ " is largest");
} else {
System.out.println(c+ " is largest");
}
}
}