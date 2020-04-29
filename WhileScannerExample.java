import java.util.*;
public class WhileScannerExample {
    public static void main (String[] agrs){
        int sum= 0;
        Scanner scan = new Scanner(System.in);
       
            System.out.println("입력");
           // String value = scan.next();
            //System.out.println(value);
            //if(value == "y"){
            //    System.out.println("대문자");
            //}else{
              //  System.out.println(value.length());
            //}
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            tosum(num1,num2);
            System.out.println(num1+ "부터" +num2+"까지의 합 ="+tosum(num1,num2));

    }
    public static long tosum(long a1, long a2){
        long sum =0;
        for(long i = a1; i <= a2; i++){
            for(long j =0; j < i ; j++){
            System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
        }
            sum += i;
            System.out.print("\n");
        }
        return sum;
    }
    }

