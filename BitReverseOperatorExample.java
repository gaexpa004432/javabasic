public class BitReverseOperatorExample {
	public static void main (String[] args){
		int a1 = 10 , a2 = ~a1 , a3 = a2 +1;	
	
		
		String returnValue = toBinaryString(a1);
		System.out.println(returnValue);
		String returnValue1 = toBinaryString(a2);
		System.out.println(returnValue1);
		String returnValue2 = toBinaryString(a3);
		System.out.println(returnValue2);
		int result;
		result = a1 +a2;
		System.out.println(result);
		//51
	}
	public static String toBinaryString(int val){
		String str = Integer.toBinaryString(val);
		while(str.length()< 32){
			str = "0" +str;
			
		}
		return str;
	}
}