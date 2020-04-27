	public class To{
	public static String toBinaryString(int val){
		String str = Integer.toBinaryString(val);
		while(str.length()< 32){
			str = "0" +str;
			
		}
		return str;
	}
	}