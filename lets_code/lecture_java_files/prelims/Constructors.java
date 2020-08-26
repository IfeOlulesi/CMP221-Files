package lets_code.lecture_java_files.prelims;

class Constructors {
	
	public Constructors (String bob) {
		System.out.println("From the constructor..."+bob);
	}
	
	public int toSum(int a) {
		System.out.println("singular...");
		return a;
	}
	
	public int toSum(int a, int b) {
		System.out.println("plural double...");
		return a + b;
	}
	
	public int toSum(int a, int b, int c) {
		System.out.println("plural triple...");
		return a + b + c;
	}
	
	public static void main(String args[]) {
		
		Constructors cn = new Constructors("Jack");
		// System.out.println("From the main method...");
		
		System.out.println(cn.toSum(2));
		System.out.println(cn.toSum(2, 3));
		System.out.println(cn.toSum(6,2, 6));
		// System.out.println(cn.toSum(6,2, 6, 5));
		
	}
	
}