import java.util.Scanner;
public class KilometersBill {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of Kilometers");
int a = obj.nextInt();
int b;
if (a>100) {
b=1010+(a-100)*9;
System.out.println("bill = "+b);
} else if (a<=100&&a>10) {
b=(a-10)*10+110;
System.out.println("bill = "+b);
} else {
b=a*11;
System.out.println("bill = "+b);
} 
}
}