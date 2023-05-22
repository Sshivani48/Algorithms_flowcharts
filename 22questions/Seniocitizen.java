import java.util.Scanner;
public class Seniocitizen {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter age");
int age = obj.nextInt();
if (age>60) {
System.out.println("Senior Citizen");
} else {
System.out.println("Not Senior citizen");
}
}
}
