import java.util.Scanner;
public class NetBonus {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of sevice years");
int a = obj.nextInt();
System.out.println("Enter Salary");
int b = obj.nextInt();
int c;
if (a>10) {
c=(10*b)/100;9
System.out.println("Net Bonus = "+c);
} else if(a>6 && a<=10) {
c=(8*b)/100;
System.out.println("Net Bonus = "+c);
} else {
c=(5*b)/100;
System.out.println("Net Bonus = "+c);
}
}
}
