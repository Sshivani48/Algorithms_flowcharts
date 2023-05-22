import java.util.Scanner;
public class Monument {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter City name to display monument of the city");
String city = obj.next();
switch(city) {
case "Delhi":System.out.println("Redfort");
break;
case "Agra" :System.out.println("Taj Mahal");
break;
case "Jaipur" :System.out.println("Jal Mahal");
break;
default: System.out.println("Invalid city");
}
}
}