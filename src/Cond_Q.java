public class Cond_Q {
    public static void main(String[] args) {
        //당신은 연령에 따라 메시지를 출력하는 프로그램을 작성해야 한다.
        //이 프로그램은 int age 라는 변수를 사용해야 하며, 연령에 따라 다음의 출력을 해야 한다.
        //7세 이하 : 미취학
        //8세이상 13세 이하 : 초등학생
        //14세 이상 16세 이하 : 중학생
        // 17세 이상 19세 이하 :고등학생
        // 20세 이상인 경우 : 성인
        int age = 44;
        if (age <= 7) {
            System.out.println("미취학");
        } else if(age > 7 && age <= 13) {
            System.out.println("초등학생");
           } else if(age > 13 && age <= 16){
            System.out.println("중학생");
        } else if(age > 16 && age <= 19){
            System.out.println("고등학생");
        } else if(age >19){
            System.out.println("성인");
        }
    }
}
