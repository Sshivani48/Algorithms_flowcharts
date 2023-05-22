import java.util.Scanner;
public class Lastdigit {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int a = obj.nextInt();
int b;
b=a%10;
if (b%3==0) {
System.out.println("Last digit of "+a+" is "+b+" which is divisible by 3");
} else {
System.out.println("Last digit of "+a+" is "+b+" which is not divisible by 3");
}
}
}
