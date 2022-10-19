
class Test {


	private static class InstanceHolder { // is not called
		static String _a = "1";
		static String _b = b;
		static {
			System.out.println("InstanceHolder static");
		}
		private static final Test INSTANCE = new Test();
	}


	public Test() {
		System.out.println("Test()");
	}

	static String b = sayHello(); // a static method is called to assign value to b.
	// but its a has not been initialized yet.

	static String sayHello() {
		System.out.println("sayHello()");
		return a;
	}

	static String a = "hello";

	static {
		c = "ccc";
	}

	static String c = sayHello(); // assignes "hello" to variable c

	static String d = c;
	//static String e = f; // compiler: illegal forward reference

	final static String f = "fff"; // assignes "hello" to variable c
	final static String g = "ggg"; // assignes "hello" to variable c
}
