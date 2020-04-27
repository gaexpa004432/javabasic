public class BitReverseOperatorExample {
	public static void main (String[] args) {
		final int a1 = 10, a2 = ~a1, a3 = a2 + 1;

		To to = new To();
		String returnValue = to.toBinaryString(a1);
		System.out.println(returnValue);
		String returnValue1 = to.toBinaryString(a2);
		System.out.println(returnValue1);
		String returnValue2 = to.toBinaryString(a3);
		System.out.println(returnValue2);
		int result;
		result = a1 +a3;
		System.out.println(result);
		//51
	}

}