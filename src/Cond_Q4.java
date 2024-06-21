public class Cond_Q4 {
    public static void main(String[] args) {
        //특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램.
        // 달러가 0 미만이라면 "잘못된 금액입니다."
        // 달러가 0일때 " 환전할 금액이 없습니다."
        // 달러가 0 초과일때 "환전 금액은 (계산된 원화 금액)원입니다."
        int dollar = 50;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다. ");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
