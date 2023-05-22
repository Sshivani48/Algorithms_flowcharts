import java.util.Scanner;
public class CostRoadtax {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter Cost to display Road tax");
int a = obj.nextInt();
if (a>100000) {
System.out.println("Road tax is 15% of cost : "+((15*a)/100));
} else if(a>50000 && a<=100000) {
System.out.println("Road tax is 10% of cost : "+((10*a)/100));
} else {
System.out.println("Road tax is 5% of cost : "+((5*a)/100));
}
}
}