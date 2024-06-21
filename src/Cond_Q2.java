public class Cond_Q2 {
    public static void main(String[] args) {
        //학생으 점수를 기반으로 학점을 출력하는 자바 프로그램 작성
        // 90점 이상 :A 80점 이상 90점 이하:B   70점 이상 80점 미만 :C
        // 60점 이상 70점 미만 : D   60점 미만 :F
        int score = 25;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score < 90){
            System.out.println("B");
        } else if (score >= 70 && score < 80){
            System.out.println("C");
        } else if (score >= 60 && score < 70){
            System.out.println("D");
        } else if (score < 60){
            System.out.println("F");
        }
    }
}
