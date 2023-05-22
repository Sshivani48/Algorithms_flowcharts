import java.util.Scanner;
public class Electricitybill {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of Units");
int a = obj.nextInt();
int b;
if (a>200) {
b=500+(a-200)*10;
System.out.println("Electricity bill = "+b);
} else if (a<=200&&a>100) {
b=(a-100)*5;
System.out.println("Electricity bill = "+b);
} else {
b=0;
System.out.println("Electricity bill = "+b);
} 
}
}