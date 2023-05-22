import java.util.Scanner;
public class Operators {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter two numbers");
int a = obj.nextInt();
int b = obj.nextInt();
System.out.println("Enter an operator");
char op = obj.next().charAt(0);
switch(op) {
case '+':a+=b;
System.out.println("Addition of two numbers = "+a);
break;
case '-':a-=b;
System.out.println("Subtraction of two numbers = "+a);
break;
case '*':a*=b;
System.out.println("Multiplication of two numbers = "+a);
break;
case '/':a/=b;
System.out.println("Division of two numbers = "+a);
break;
default: System.out.println("Invalid operator");
}
}
}
