class Test2 {

	static String sayHello() {
		return a;
	}

	static String b = sayHello(); // a static method is called to assign value to b.
	// but its a has not been initialized yet.

	final static String a = "hello";

	static String c = sayHello(); // assignes "hello" to variable c
}

//class Test3 extends Test2 {
//    @Override
//    static String sayHello() {
//        return "";
//    }
//}
