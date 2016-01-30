public class Assert {

	static public void check(int i) {
		assert i > 0: "Value must be positive";
		System.out.println("Value fine " + i);
	}

	public static void main(String args[]) {
		check(Integer.parseInt(args[0]));
	}
}