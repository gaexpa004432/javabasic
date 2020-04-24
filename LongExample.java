public class LongExample {
	public static void main (String[] agrs){
	long a1 = 100 , a2 = 20L ,  a3 = 100000000000000L;
	int a4 = Integer.MAX_VALUE , a5 = 1;
	System.out.println( a4 );
	int result = a4+ a5;
	System.out.println(result);
	if (a4 <= Integer.MAX_VALUE - a5 ) {
		int result2 = a4 + a5;
		System.out.println(result2);
		
	}else{
		System.out.println("overflow");
	}
	int b1 =5,b2 =8;
	if (a1 < b1 * b2){
		System.out.println("no script");  
	}else{
		System.out.println(a3 +"oomi"+ b1 * b2);
	}
	}
}