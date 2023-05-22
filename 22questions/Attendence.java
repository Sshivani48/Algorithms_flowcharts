import java.util.Scanner;
public class Attendence {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of working days");
int a = obj.nextInt();
System.out.println("Enter number of days for absent");
int b = obj.nextInt();
int c = ((a-b)*100)/a;
if (c>=75) {
System.out.println("Eligible to write exam");
} else {
System.out.println("Noteligible to write exam");
}
}
}
