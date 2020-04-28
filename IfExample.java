
public class IfExample {
    public static void main(String[] agrs) {
        int score = (int) (Math.random() * 45)+1;
        for (int i = 0; i < 6; i++) {
            score = (int) (Math.random() * 45)+1;
            if( score == 0){
                score = (int)(Math.random() * 45)+1;
                System.out.println("0숫자 보정 ");
            }
            
            System.out.println("로또번호 " + score);
         
        }
        if (score >= 90) {
            System.out.println("A등급입니다" + score);
        } else if (score >= 80) {
            System.out.println("B등급입니다" + score);
        } else if (score >= 70) {
            System.out.println("C등급입니다" + score);
        } else {
            System.out.println("끝");
        }
    }
}