class Test {

	//static String q = "11";

	static String b = sayHello(); // a static method is called to assign value to b.
	// but its a has not been initialized yet.

	static String sayHello() {
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
