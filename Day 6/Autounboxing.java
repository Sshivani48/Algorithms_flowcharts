class Autounboxing {
	public static void main(String[] args) {
		Integer a = new Integer(48);	// creates objects of wrapper class
		Double b = new Double(3.8);
		int A = a.intValue();	// converts into primitive types
		double B = b.doubleValue();
		System.out.println("The value of a: " + A);
		System.out.println("The value of b: " + B);
	}
}