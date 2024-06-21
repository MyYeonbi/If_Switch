public class Switch_Q1 {
    public static void main(String[] args) {
        //당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
        // 이 프로그램은 int grade라는 변수를 사용하며, 회원 등급(grade)에 따라 다음의 쿠폰을 발급해야 한다.
        //1등급 :쿠폰 1000
        //2등급 : 2000
        //3등급 : 3000
        //위의 등급이 아닐 경우 : 쿠폰 500
        //출력값 : 발급받은 쿠폰 +쿠폰값.
        int grade = 1;

        int coupon;
        switch (grade){
            case 1 :
                coupon = 1000;
                break; //break가 없다면 case 1이더라도 결과값은 2000으로 뜸
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰" + coupon);
    }
}
