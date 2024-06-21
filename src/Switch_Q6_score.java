public class Switch_Q6_score {
    public static void main(String[] args) {
        //String grade라는 문자역을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자.
        String grade = "C";
        switch (grade){
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 성과입니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                    System.out.println("잘못된 학점입니다.");
        }
    }
}
