
public class IfExample {
    public static void main(String[] agrs) {
        int[] a = new int[6];
        int temp = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    a[i] = (int) (Math.random() * 45) + 1;
                    j = 0;
                    System.out.println("중복 제거");
                }
            }

        }
        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 5; i++) {
                if (a[i] > a[i + 1]) {

                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}