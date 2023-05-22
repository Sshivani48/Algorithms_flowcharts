import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter three sides");
int a = obj.nextInt();
int b = obj.nextInt();
int c = obj.nextInt();
if (a==b&&a==c) {
System.out.println("Equilateral triangle");
} else if(a!=b&&b!=c&&a!=c) {
System.out.println("Scalene triangle");
} else {
System.out.println("Isoceles triangle");
}
}
}
