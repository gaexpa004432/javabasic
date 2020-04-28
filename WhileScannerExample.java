import java.util.*;
public class WhileScannerExample {
    public static void main (String[] agrs){
        int sum= 0;
        Scanner scan = new Scanner(System.in);
       
            System.out.println("입력");
            String value = scan.next();
            System.out.println(value);
            if(value =="y"){
                System.out.println("대문자");
            }else{
                System.out.println(value.length());
            }
           
    }
    }

