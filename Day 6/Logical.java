public class Logical
{
	public static void main(String[] args) {
		System.out.println("Logical Operators");
		int a=20;
		int b=30;
		int c=40;
		System.out.println(a>b&&a<c);
		System.out.println(a>b||a<c);
		System.out.println(a!=b&&a>c);
		System.out.println(a==b&&a<=c);
		System.out.println(!(a>b&&a<c));
	}
}