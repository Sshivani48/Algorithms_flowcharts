import java.util.Scanner;
public class Percgrade {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter Percentage");
int a = obj.nextInt();
if (a>80) {
System.out.println("Grade A+");
} else if(a>60 && a<=80) {
System.out.println("Grade A");
} else if(a>50 && a<=60) {
System.out.println("Grade B+");
} else if(a>45 && a<=50) {
System.out.println("Grade B");
} else if(a>=25 && a<=45) {
System.out.println("Grade C");
} else {
System.out.println("Grade D");
}
}
}
