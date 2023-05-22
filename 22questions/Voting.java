import java.util.Scanner;
public class Voting {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter age");
int age = obj.nextInt();
if (age>=18) {
System.out.println("Eligible for voting");
} else {
System.out.println("Not eligible for voting");
}
}
}
