import java.util.Scanner;
public class Discount {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter marked price");
int a = obj.nextInt();
int b;
if (a>10000) {
b=a-((20*a)/100);
System.out.println("Net amount to pay = "+b);
} else if(a>7000 && a<=10000) {
b=a-((15*a)/100);
System.out.println("Net amount to pay = "+b);
} else {
b=a-((10*a)/100);
System.out.println("Net amount to pay = "+b);
}
}
}