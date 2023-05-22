import java.util.Scanner;
public class PercCategory {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter Percentage");
int a = obj.nextInt();
if (a>=65) {
System.out.println("Excellent");
} else if(a>=55 && a<65) {
System.out.println("Good");
} else if(a>=40 && a<55) {
System.out.println("Fair");
} else {
System.out.println("Failed");
}
}
}
