public class RemindExample {
	public static void main (String[] agrs){
	byte b1 = 70, b2 = 50;
	int result = b1 + b2;
	System.out.println("gg"+ result);
	int n1 = b1;
	b1 = (byte) n1;
	System.out.println ( n1 + " " + b1);
	}
}