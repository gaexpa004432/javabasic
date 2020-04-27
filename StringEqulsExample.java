
public class StringEqulsExample {
    public static void main(String[] agrs) {
        String s[] = { "안녕", "안녕", "안녕" };
        String s1 = new String("안녕");

        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s1);

        System.out.println(s[0].equals(s[1]));
        System.out.println(s[0] == s1);
    }
}