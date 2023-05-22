import java.util.Scanner;
public class Marksgrade {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter Marks");
int a = obj.nextInt();
if (a>90) {
System.out.println("Grade A");
} else if(a>80 && a<=90) {
System.out.println("Grade B");
} else if(a>=60 && a<=80) {
System.out.println("Grade C");
} else {
System.out.println("Grade D");
}
}
}